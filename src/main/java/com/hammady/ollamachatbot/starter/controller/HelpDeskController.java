package com.hammady.ollamachatbot.starter.controller;

import com.hammady.ollamachatbot.starter.dto.HelpDeskRequest;
import com.hammady.ollamachatbot.starter.dto.HelpDeskResponse;
import com.hammady.ollamachatbot.starter.service.HelpDeskChatbotAgentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/helpdesk")
public class HelpDeskController {
    private final HelpDeskChatbotAgentService helpDeskChatbotAgentService;

    public HelpDeskController(HelpDeskChatbotAgentService helpDeskChatbotAgentService) {
        this.helpDeskChatbotAgentService = helpDeskChatbotAgentService;
    }

    @CrossOrigin
    @PostMapping("/chat")
    public HelpDeskResponse chat(@RequestBody HelpDeskRequest helpDeskRequest) {
        var chatResponse = helpDeskChatbotAgentService.call(helpDeskRequest.getPromptMessage(), helpDeskRequest.getHistoryId());
        return new HelpDeskResponse(chatResponse);
    }
}
