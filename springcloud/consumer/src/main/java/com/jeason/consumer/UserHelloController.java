package com.jeason.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@RestController
public class UserHelloController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/usehello")
    public String useHello(){
        String url = "http://provider/provider/hello";
        String result = restTemplate.getForObject(url,String.class);
        return result;
    }
}
