package com.krishna.notification_service.consumer;

import com.krishna.notification_service.dto.NotificationEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {
    @KafkaListener(topics = "banking-notification")
    public void consume(NotificationEvent event) {
//        emailService.sendEmail(event);
        System.out.println("Event is here "+event.getEmail());
    }
}
