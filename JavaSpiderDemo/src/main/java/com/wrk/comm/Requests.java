package com.wrk.comm;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.UnsupportedCharsetException;
import java.util.HashMap;
import java.util.Map;

public class Requests {
    private HttpPost httpPost;
    public Requests() {
        httpPost = new HttpPost();
    }

    public String postForJson(String url , String params , String headers){
        String error = null;
        httpPost.setURI(URI.create(url));
        if (params !=null && !"".equals(params)){
            try {
                httpPost.setEntity(new StringEntity(params, ContentType.APPLICATION_JSON));
            } catch (UnsupportedCharsetException e) {
                error = "请求参数有误";
            }
        }
        if (headers!= null && !"".equals(headers)){
            try {
                HashMap<String,String> headersMap = JSON.parseObject(params, HashMap.class);
                for (Map.Entry<String, String> stringEntry : headersMap.entrySet()) {
                    httpPost.setHeader(stringEntry.getKey(),stringEntry.getValue());
                }
            } catch (Exception e) {
                error = "请求体有误";
            }
        }
        try {
            HttpClient http = new DefaultHttpClient();
            HttpResponse response = http.execute(httpPost);
            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return error;
    }
    public String postForMap(String url , Map params , Map headers){
        String error = null;
        httpPost.setURI(URI.create(url));
        if (params !=null && !"".equals(params)){
            try {
                httpPost.setEntity(new StringEntity(JSON.toJSONString(params), ContentType.APPLICATION_JSON));
            } catch (UnsupportedCharsetException e) {
                error = "请求参数有误";
            }
        }
        if (headers!= null && !"".equals(headers)){
            try {
                Map<String,String> headersMap = (HashMap<String,String>)headers;
                for (Map.Entry<String, String> stringEntry : headersMap.entrySet()) {
                    httpPost.setHeader(stringEntry.getKey(),stringEntry.getValue());
                }
            } catch (Exception e) {
                error = "请求体有误";
            }
        }
        try {
            HttpClient http = new DefaultHttpClient();
            HttpResponse response = http.execute(httpPost);
            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return error;
    }
}
