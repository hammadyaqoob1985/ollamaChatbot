package com.hammady.ollamachatbot.starter.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HelpDeskRequest {
    @JsonProperty("prompt_message")
    String promptMessage;

    @JsonProperty("history_id")
    String historyId;

    public HelpDeskRequest() {
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public String getHistoryId() {
        return historyId;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public void setHistoryId(String historyId) {
        this.historyId = historyId;
    }
}
