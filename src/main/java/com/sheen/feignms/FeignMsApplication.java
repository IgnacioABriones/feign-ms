package com.sheen.feignms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignMsApplication.class, args);
    }

}
