package com.jeason.openfeign;

import com.jeason.providerclient.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    ProviderClient providerClient;

    @GetMapping("/clienthello")
    public String clienthello(){
        System.out.println("client");
        return providerClient.hello();
    }
}
