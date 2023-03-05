package com.github.wenqiglantz.service.openaiclient.restcontroller;

import com.github.wenqiglantz.service.openaiclient.model.request.TranscriptionRequest;
import com.github.wenqiglantz.service.openaiclient.model.response.ChatGPTResponse;
import com.github.wenqiglantz.service.openaiclient.model.request.ChatRequest;
import com.github.wenqiglantz.service.openaiclient.model.response.WhisperTranscriptionResponse;
import com.github.wenqiglantz.service.openaiclient.service.OpenAIClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1")
public class OpenAIClientController {

    private final OpenAIClientService openAIClientService;

    @PostMapping(value = "/chat", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ChatGPTResponse chat(@RequestBody ChatRequest chatRequest){
        return openAIClientService.chat(chatRequest);
    }

    @PostMapping(value = "/transcription", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public WhisperTranscriptionResponse createTranscription(@ModelAttribute TranscriptionRequest transcriptionRequest){
        return openAIClientService.createTranscription(transcriptionRequest);
    }
}
