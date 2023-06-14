package com.example.privatechatgpt.api;

import com.example.privatechatgpt.config.ChatGptConfiguration;
import com.example.privatechatgpt.dto.ResponseBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(url = "${ChatGptUrl}",
        contextId = "completion",
        name = "completion",
        configuration = ChatGptConfiguration.class)
public interface CompletionApi {
    @PostMapping("/v1/completions")
    ResponseBody getCompletions();

}
