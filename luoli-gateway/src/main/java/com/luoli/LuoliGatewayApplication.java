package com.luoli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author liluo
 * @create 2022/6/1 1:08
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class LuoliGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(LuoliGatewayApplication.class);
    }
}
