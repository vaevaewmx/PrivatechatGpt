package com.example.privatechatgpt.api;

import com.example.privatechatgpt.config.ChatGptConfiguration;
import com.example.privatechatgpt.dto.ResponseBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(url = "${ChatGptUrl}",
        contextId = "chat",
        name = "chat",
        configuration = ChatGptConfiguration.class)
public interface ChatApi {
    @PostMapping("/v1/chat/completions")
    ResponseBody getChatCompletions();
}
