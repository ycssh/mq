package cn.yc.ssh.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {  
  
    @JmsListener(destination = "github-queue")
    public void receiveQueue(String text) {  
        System.out.println(text);  
    }  
  
    @JmsListener(destination = "github-queue1")
    public void receiveQueue1(String text) {
        System.out.println(text);
    }

}