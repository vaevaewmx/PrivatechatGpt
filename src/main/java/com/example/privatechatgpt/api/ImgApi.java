package com.example.privatechatgpt.api;

import com.example.privatechatgpt.config.ChatGptConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "${ChatGptUrl}",
        contextId = "img",
        name = "img",
        configuration = ChatGptConfiguration.class)
public interface ImgApi {
}
