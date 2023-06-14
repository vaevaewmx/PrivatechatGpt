package com.example.privatechatgpt.api;

import com.example.privatechatgpt.config.ChatGptConfiguration;
import com.example.privatechatgpt.dto.EmbedResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(url = "${ChatGptUrl}",
        contextId = "embedding",
        name = "embedding",
        configuration = ChatGptConfiguration.class)
public interface EmbeddingApi {
    @PostMapping("/v1/embeddings")
    EmbedResponse createEmebding();
}
