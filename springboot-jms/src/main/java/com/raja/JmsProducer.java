package com.raja;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JmsProducer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void sendMessage(String message) {
        this.jmsMessagingTemplate.convertAndSend("test.queue", message);
        log.info("Message sent Successfully");
    }
}
