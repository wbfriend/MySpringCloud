package com.my.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @EnableDiscoveryClient与@EnableEurekaClient区别
 * 在使用Spring Cloud feign使用中在使用服务发现的时候提到了两种注解，
 * 一种为@EnableDiscoveryClient,一种为@EnableEurekaClient,用法上基本一致。
 * @SpringBootApplication  //启动springboot
 * @EnableEurekaClient     // 注册与发现（注册中心）
 * @EnableFeignClients     //启用feign客户端；（负载均衡）
 * @EnableCircuitBreaker   //启动断路器
 *
 * {@EnableHystrix          //@EnableHystrix 启动熔断降级服务
 * @EnableHystrix 启动熔断降级服务
 * @Component把普通的pojo类实例到spring容器中去，
 * 相当于配置文件中的<bean id="" class=""/>
 * 熔断降级实现接口FallbackFactory<server>，重写需要熔断降级的服务，
 * 加上@Component注解将HystrixClientFactory类交给spring容器去管理，}
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrix
public class SpringcloudDeptConsumerApplication {
//    @Bean
//    @LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
//    public RestTemplate getRestTemplate()
//    {
//        return new RestTemplate();
//    }
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudDeptConsumerApplication.class, args);
    }

}
