package com.example.spring_chatgpt.controller;

import com.example.spring_chatgpt.Service.ChatGPTService;
import com.example.spring_chatgpt.model.SearchQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class ChatGPTrestController {

    private ChatGPTService chatGPTService;

    public ChatGPTrestController(ChatGPTService chatGPTService) {
        this.chatGPTService = chatGPTService;
    }

    @PostMapping("/search")
    public String search(@RequestBody SearchQuery searchQuery)
    {
        log.info("Search started"+searchQuery.getQuery());
        return chatGPTService.processSearch(searchQuery.getQuery());
    }


}
