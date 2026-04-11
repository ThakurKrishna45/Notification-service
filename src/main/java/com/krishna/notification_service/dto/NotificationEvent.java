package com.krishna.notification_service.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter @Setter
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