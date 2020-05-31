package com.jeason.providerclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("provider")
public interface ProviderClient {
    @GetMapping("/hello")
    String hello();
}
