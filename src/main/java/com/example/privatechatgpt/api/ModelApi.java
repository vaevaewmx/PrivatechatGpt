package com.example.privatechatgpt.api;

import com.example.privatechatgpt.config.ChatGptConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "${ChatGptUrl}",
        contextId = "model",
        name = "model",
        configuration = ChatGptConfiguration.class)
public interface ModelApi {
}
