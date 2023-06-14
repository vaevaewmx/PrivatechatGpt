package com.example.privatechatgpt.api;

import com.example.privatechatgpt.config.ChatGptConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "${ChatGptUrl}",
        contextId = "moderation",
        name = "moderation",
        configuration = ChatGptConfiguration.class)
public interface ModerationApi {
}
