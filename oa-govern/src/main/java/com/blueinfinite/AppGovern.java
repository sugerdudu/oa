package com.blueinfinite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AppGovern {
    public static void main(String[] args) {
        SpringApplication.run(AppGovern.class,args);
    }
}
