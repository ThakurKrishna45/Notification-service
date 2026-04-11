package com.krishna.notification_service.consumer;

import com.krishna.notification_service.dto.NotificationEvent;
import org.springframework.kafka.annotation.KafkaListener;

public class NotificationConsumer {
    @KafkaListener(topics = "notification-events")
    public void consume(NotificationEvent event) {
//        emailService.sendEmail(event);
        System.out.println("Event is here "+event.getEmail());
    }
}
