package com.example.spring_chatgpt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.message.Message;

import java.util.List;

@Data
public class ChatGPTResponse {

    private List<ChatGPTChoice> choices;


}
