package com.ecs.customize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by yin on 2017/5/3.
 */

@SpringBootApplication
@EnableEurekaClient
public class CustomizeApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomizeApplication.class, args);
    }
}
