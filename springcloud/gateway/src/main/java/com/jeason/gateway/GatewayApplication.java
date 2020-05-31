package com.jeason.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

//    @Bean
//    RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder){
//        return routeLocatorBuilder.routes().route("jeason_route",r -> r.path("/get").uri("http://httpbin.org"))
//                .build();
//    }
}
