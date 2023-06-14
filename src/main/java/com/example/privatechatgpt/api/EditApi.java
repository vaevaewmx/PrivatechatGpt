package com.example.privatechatgpt.api;

import com.example.privatechatgpt.config.ChatGptConfiguration;
import com.example.privatechatgpt.dto.ResponseBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(url = "${ChatGptUrl}",
        contextId = "edit",
        name = "edit",
        configuration = ChatGptConfiguration.class)
public interface EditApi {
    @PostMapping("/v1/edits")
    ResponseBody createEdits();
}
