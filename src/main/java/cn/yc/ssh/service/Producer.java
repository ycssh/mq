package cn.yc.ssh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

@Component
public class Producer{
  
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
  
    @Autowired  
    private Queue queue;

    public void send(String msg) {
        this.jmsMessagingTemplate.convertAndSend(this.queue, msg);  
    }  
  
    @Autowired
    private Queue queue1;

    public void send1(String msg) {
        this.jmsMessagingTemplate.convertAndSend(this.queue1, msg);
    }

}