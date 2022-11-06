package com.example.rabbitmq.springrabbitmqconsumer.Controller;

import com.example.rabbitmq.springrabbitmqconsumer.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Consumer {

    @RabbitListener(queues = "queue.A")
    private void receive(Message message){
        log.info("message recieved from Queue A ->{}", message );


    }

    @RabbitListener(queues = "queue.B")
    private void receiveFromB(Message message){
        log.info("message recieved from Queue B ->{}", message );


    }
}

