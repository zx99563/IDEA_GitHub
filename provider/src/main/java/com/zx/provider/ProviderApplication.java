package com.zx.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderApplication {

    public static void main(String[] args) {
        System.out.println("233666");
        SpringApplication.run(ProviderApplication.class, args);
    }

}
