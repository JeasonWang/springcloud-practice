package com.jeason.openfeign.controller;

import com.jeason.providerclient.ProviderClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    ProviderClient providerClient;

    @ApiOperation(value = "调用helloprovider", notes="openfeign调用provider")
    @ApiImplicitParam(name = "name", value = "name", paramType = "query", required = true, dataType = "String")
    @GetMapping("/openhello")
    public String clienthello(String name){
        System.out.println(name);
        return providerClient.hello();
    }

    @ApiOperation(value = "调用getprovider", notes="openfeign调用provider")
    @GetMapping("/opengetprovider")
    public String getProvider(){
        return providerClient.getProvider();
    }
}
