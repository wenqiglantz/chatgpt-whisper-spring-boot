package com.github.wenqiglantz.service.openaiclient.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatGPTRequest implements Serializable {

    private String model;
    private List<Message> messages;
}
