package com.example.privatechatgpt.api;

import com.example.privatechatgpt.config.ChatGptConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(url = "${ChatGptUrl}",
        contextId = "audio",
        name = "audio",
        configuration = ChatGptConfiguration.class)
public interface AudioApi {
    @PostMapping("/v1/audio/transcriptions")
    String getTranscription();

    @PostMapping("/v1/audio/translations")
    String getTranslation();
}
