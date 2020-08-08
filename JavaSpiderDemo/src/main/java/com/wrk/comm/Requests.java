package com.wrk.comm;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
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
    private HttpClient httpClient;

    public Requests() {
        httpClient = new DefaultHttpClient();
    }
    public Map getforMap(String url, Map headers) {
        String error = null;
        HttpGet httpGet = new HttpGet();
        if (url !=null && !"".equals(url)){
            httpGet.setURI(URI.create(url));
        }
        if (headers != null && !headers.isEmpty()) {
            try {
                Map<String, String> headersMap = (HashMap<String, String>) headers;
                for (Map.Entry<String, String> stringEntry : headersMap.entrySet()) {
                    httpGet.setHeader(stringEntry.getKey(), stringEntry.getValue());
                }
            } catch (Exception e) {
                error = "请求头有误";
            }
        }
        try {
            HttpResponse response = httpClient.execute(httpGet);
            return JSON.parseObject(EntityUtils.toString(response.getEntity()),Map.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        HashMap errorMap = new HashMap();
        errorMap.put("error",error);
        return errorMap;
    }

    public String getForString(String url, Map headers,String charset) {
        String error = null;
        if (charset ==null || "".equals(charset)){
            charset = "UTF-8";
        }
        HttpGet httpGet = new HttpGet();
        if (url !=null && !"".equals(url)){
            httpGet.setURI(URI.create(url));
        }
        if (headers != null && !headers.isEmpty()) {
            try {
                Map<String, String> headersMap = (HashMap<String, String>) headers;
                for (Map.Entry<String, String> stringEntry : headersMap.entrySet()) {
                    httpGet.setHeader(stringEntry.getKey(), stringEntry.getValue());
                }
            } catch (Exception e) {
                error = "请求头有误";
            }
        }
        try {
            HttpResponse response = httpClient.execute(httpGet);
            return new String(EntityUtils.toString(response.getEntity()).getBytes("ISO-8859-1"),charset);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return error;
    }

    public String postForJson(String url, String params, String headers) {
        HttpPost httpPost = new HttpPost();
        String error = null;
        httpPost.setURI(URI.create(url));
        if (params != null && !"".equals(params)) {
            try {
                httpPost.setEntity(new StringEntity(params, ContentType.APPLICATION_JSON));
            } catch (UnsupportedCharsetException e) {
                error = "请求参数有误";
            }
        }
        if (headers != null && !"".equals(headers)) {
            try {
                HashMap<String, String> headersMap = JSON.parseObject(params, HashMap.class);
                for (Map.Entry<String, String> stringEntry : headersMap.entrySet()) {
                    httpPost.setHeader(stringEntry.getKey(), stringEntry.getValue());
                }
            } catch (Exception e) {
                error = "请求体有误";
            }
        }
        try {
            HttpResponse response = httpClient.execute(httpPost);
            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return error;
    }

    public Map postForMap(String url, Map params, Map headers) {
        HttpPost httpPost = new HttpPost();
        String error = null;
        httpPost.setURI(URI.create(url));
        if (params != null && !params.isEmpty()) {
            try {
                httpPost.setEntity(new StringEntity(JSON.toJSONString(params), ContentType.APPLICATION_JSON));
            } catch (UnsupportedCharsetException e) {
                error = "请求参数有误";
            }
        }
        if (headers != null && !headers.isEmpty()) {
            try {
                Map<String, String> headersMap = (HashMap<String, String>) headers;
                for (Map.Entry<String, String> stringEntry : headersMap.entrySet()) {
                    httpPost.setHeader(stringEntry.getKey(), stringEntry.getValue());
                }
            } catch (Exception e) {
                error = "请求头有误";
            }
        }
        try {
            HttpResponse response = httpClient.execute(httpPost);
            return JSON.parseObject(EntityUtils.toString(response.getEntity()),Map.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        HashMap errorMap = new HashMap();
        errorMap.put("error",error);
        return errorMap;
    }
}
