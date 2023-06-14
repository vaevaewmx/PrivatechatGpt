package com.example.privatechatgpt.api;

import com.example.privatechatgpt.config.ChatGptConfiguration;
import com.example.privatechatgpt.dto.DeleteFileResponse;
import com.example.privatechatgpt.dto.FileResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(url = "${ChatGptUrl}",
        contextId = "file",
        name = "file",
        configuration = ChatGptConfiguration.class)
public interface FileApi {
    @GetMapping("/v1/files")
    List<FileResponse> getFileList();

    @PostMapping("/v1/files")
    FileResponse uploadFile();

    @DeleteMapping("/v1/files/{file_id}")
    DeleteFileResponse deleteFile();

    @GetMapping("/v1/files/{file_id}")
    FileResponse getFileDetail();

    @GetMapping("/v1/files/{file_id}/content")
    String getFileContent();


}
