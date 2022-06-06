package com.luoli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author liluo
 * @create 2022/6/1 0:51
 */
@SpringBootApplication
@EnableEurekaServer
public class LuoliRegestryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LuoliRegestryApplication.class);
    }
}
