package com.devdi.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by devdi on 10/5/14.
 */
@Service
public class MessageService {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(final Message message) {
        jmsTemplate.convertAndSend("news.queue", message);
    }

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }
}
