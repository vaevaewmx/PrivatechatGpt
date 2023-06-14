package com.example.privatechatgpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PrivateChatGptApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrivateChatGptApplication.class, args);
    }

}
