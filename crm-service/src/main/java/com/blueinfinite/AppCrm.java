package com.blueinfinite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AppCrm {
    public static void main(String[] args) {
        SpringApplication.run(AppCrm.class,args);
    }
}
