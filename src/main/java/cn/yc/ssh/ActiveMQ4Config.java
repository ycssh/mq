package cn.yc.ssh;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;

@EnableJms
@Configuration
public class ActiveMQ4Config {  
  
    @Bean
    public Queue queue() {
        return new ActiveMQQueue("github-queue");
    }  

    @Bean
    public Queue queue1() {
        return new ActiveMQQueue("github-queue1");
    }


    @Value("${spring.activemq.user}")
    public String user;
    @Value("${spring.activemq.password}")
    public String password;
    @Value("${spring.activemq.broker-url}")
    public String brokerRrl;

    @Bean
    public ActiveMQConnectionFactory activeMQConnectionFactory (){
        ActiveMQConnectionFactory activeMQConnectionFactory =
                new ActiveMQConnectionFactory(user,password,brokerRrl);
        return activeMQConnectionFactory;
    }
  
}  