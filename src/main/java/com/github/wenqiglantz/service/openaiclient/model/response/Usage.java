package com.github.wenqiglantz.service.openaiclient.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Usage implements Serializable {

    @JsonProperty("prompt_tokens")
    private String promptTokens;

    @JsonProperty("completion_tokens")
    private String completionTokens;

    @JsonProperty("total_tokens")
    private String totalTokens;
}
