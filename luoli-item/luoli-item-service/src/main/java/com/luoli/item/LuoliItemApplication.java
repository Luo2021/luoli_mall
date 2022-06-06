package com.luoli.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @Author liluo
 * @create 2022/6/1 2:08
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LuoliItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(LuoliItemApplication.class);
    }
}
