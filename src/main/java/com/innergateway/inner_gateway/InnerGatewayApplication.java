package com.innergateway.inner_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
public class InnerGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(InnerGatewayApplication.class, args);
    }

}
