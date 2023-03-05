package com.github.wenqiglantz.service.openaiclient.model.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class WhisperTranscriptionResponse implements Serializable {
    private String text;
}
