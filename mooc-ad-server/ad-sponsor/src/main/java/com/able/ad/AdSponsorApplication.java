package com.able.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @param
 * @author jipeng
 * @date 2019-09-05 18:12
 */
@SpringBootApplication
@EnableEurekaClient
public class AdSponsorApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdSponsorApplication.class, args);
    }
}

