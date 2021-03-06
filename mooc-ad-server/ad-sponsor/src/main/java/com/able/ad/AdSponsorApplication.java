package com.able.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @param
 * @author jipeng
 * @date 2019-09-05 18:12
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
@MapperScan(basePackages = "com.able.ad.mapper")
public class AdSponsorApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdSponsorApplication.class, args);

    }
}

