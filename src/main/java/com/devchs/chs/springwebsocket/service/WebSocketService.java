package com.devchs.chs.springwebsocket.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Log4j2
@RequiredArgsConstructor
@Service
public class WebSocketService {

    private final SimpMessagingTemplate messagingTemplate;

    public void send(Object message) {
        log.info("send message : {}", message);
        messagingTemplate.convertAndSend("/sub/notice", message);
    }
}
