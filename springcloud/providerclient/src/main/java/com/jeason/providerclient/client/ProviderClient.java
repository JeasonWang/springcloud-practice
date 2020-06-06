package com.jeason.providerclient.client;

import com.jeason.providerclient.fallback.ProviderFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider",path = "provider", fallback = ProviderFallback.class)
public interface ProviderClient {
    @GetMapping("/hello")
    String hello();

    @GetMapping("/getprovider")
    String getProvider();
}
