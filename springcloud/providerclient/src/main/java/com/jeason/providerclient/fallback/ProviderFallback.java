package com.jeason.providerclient.fallback;

import com.jeason.providerclient.client.ProviderClient;

public class ProviderFallback implements ProviderClient {
    @Override
    public String hello() {
        return "hello failed";
    }

    @Override
    public String getProvider() {
        return "getProvider failed";
    }
}
