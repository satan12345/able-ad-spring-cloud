package com.able.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication
@EnableZuulProxy
public class ZuulGetWayApplication {
     public static void main(String[] argsl) {
         SpringApplication.run(ZuulGetWayApplication.class,argsl);
         }
}
