package com.amit.ecommerce.payment_service.paymentservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentRequestDto {
    private String name;
    private String phoneNumber;
    private String orderId;
    private String email;
    private Long amount;
}
