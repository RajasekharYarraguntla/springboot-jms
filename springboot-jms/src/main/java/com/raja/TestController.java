package com.raja;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @Autowired
    private JmsProducer jmsProducer;

    @GetMapping("/send-message")
    public void sendMessage() {
        jmsProducer.sendMessage("Hello, World!");
    }
}
