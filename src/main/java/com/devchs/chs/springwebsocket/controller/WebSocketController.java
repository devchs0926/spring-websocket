package com.devchs.chs.springwebsocket.controller;

import com.devchs.chs.springwebsocket.dto.Message;
import com.devchs.chs.springwebsocket.service.WebSocketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class WebSocketController {

    private final WebSocketService webSocketService;

    @PostMapping("/send")
    public void send(@RequestBody Message message) {
        webSocketService.send(message);
    }
}
