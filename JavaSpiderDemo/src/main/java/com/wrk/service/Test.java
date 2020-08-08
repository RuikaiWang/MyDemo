package com.wrk.service;

import com.alibaba.fastjson.JSON;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.wrk.comm.Requests;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Test {
    @org.junit.Test
    public void test(){
        Requests requests = new Requests();
        String url = "http://221.204.170.88:8184/app/user/login";
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("userName","17635726093");
        params.put("password","Wrk960313");
        params.put("deviceId", UUID.randomUUID().toString());
        params.put("clientid","236367");
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("Content-Type", "application/json");
        headers.put("Connection", "keep-alive");
        headers.put("Accept", "*/*"); 
        headers.put("User-Agent", "san jin xian feng/3.2.6 (iPhone; iOS 13.4.1; Scale/3.00)");
        headers.put("Accept-Language", "zh-Hans-US;q=1, en-US;q=0.9");
        headers.put("Accept-Encoding", "gzip, deflate");
        try {
            Document post = Jsoup.connect(url).headers(headers).data(params).ignoreContentType(true).post();
            System.out.println(post.body());
        } catch (IOException e) {
            e.printStackTrace();
        }
//        Map response = requests.postForMap(url, params, headers);
//        response.forEach((key,value) -> System.out.println(key+":"+value));
    }
    @org.junit.Test
    public void testGet(){
        HashMap<String, String> headers = new HashMap<>();
        String response = new Requests().getForString("http://www.baidu.com", null,null);
        System.out.println(response);
    }
    public void TestJsoup(){

    }
}
