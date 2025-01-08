package com.hammady.ollamachatbot.starter.dto;

public class HistoryEntry {
    private String prompt;

    private String response;

    public HistoryEntry(String prompt, String response) {
        this.prompt = prompt;
        this.response = response;

    }

    public HistoryEntry() {
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return String.format("""
                        `history_entry`:
                            `prompt`: %s
                        
                            `response`: %s
                        -----------------
                       \n
            """, prompt, response);
    }
}
