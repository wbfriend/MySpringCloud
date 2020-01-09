package com.my.springcloud.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudEmp02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEmp02Application.class, args);
    }

}
