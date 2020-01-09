package com.my.springcloud.hytrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableFeignClients
//@EnableFeignClients(basePackages = "com.my.springcloud.api")
//@EnableHystrix
//@ComponentScan("com.my.springcloud.api")
public class SpringcloudEmpConsumerHytrix8100Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEmpConsumerHytrix8100Application.class, args);
    }

}
