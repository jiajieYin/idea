package com.hzit.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
//@EnableDiscoveryClient
//SpringBootApplication
//@EnableCircuitBreaker
@EnableFeignClients
@SpringCloudApplication
public class ConApplication {
    @Bean
    @LoadBalanced
    public  RestTemplate restTemplate(){

        return new RestTemplate();
    }
    public static void main(String[] args)
    {
        SpringApplication.run(ConApplication.class);
    }
}
