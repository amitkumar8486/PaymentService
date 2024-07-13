package com.amit.ecommerce.payment_service.paymentservice.controllers;

import com.amit.ecommerce.payment_service.paymentservice.dtos.InitiatePaymentRequestDto;
import com.amit.ecommerce.payment_service.paymentservice.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public String initiatePayment(@RequestBody InitiatePaymentRequestDto initiatePaymentRequestDto) {
        return paymentService.initiatePayment(initiatePaymentRequestDto.getName(), initiatePaymentRequestDto.getPhoneNumber(), initiatePaymentRequestDto.getOrderId(), initiatePaymentRequestDto.getEmail(), initiatePaymentRequestDto.getAmount());
    }
}
