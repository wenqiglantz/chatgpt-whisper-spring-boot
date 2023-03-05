package com.github.wenqiglantz.service.openaiclient.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.wenqiglantz.service.openaiclient.model.request.Message;
import lombok.Data;

import java.io.Serializable;

@Data
public class Choice implements Serializable {
    private Integer index;
    private Message message;
    @JsonProperty("finish_reason")
    private String finishReason;
}
