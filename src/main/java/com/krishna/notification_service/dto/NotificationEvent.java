package com.krishna.notification_service.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationEvent {

    private String referenceId;
    private String type;
    private String direction;
    private BigDecimal amount;
    private LocalDateTime date;

    private Integer accountNumber;
    private Integer relatedAccountNumber;

    private String email;

    private String status;
}