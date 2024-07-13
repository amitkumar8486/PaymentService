package com.amit.ecommerce.payment_service.paymentservice.services;

import com.amit.ecommerce.payment_service.paymentservice.paymentgateway.PaymentGateway;
import com.amit.ecommerce.payment_service.paymentservice.paymentgateway.PaymentGatewayStrategyChooser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private PaymentGatewayStrategyChooser paymentGatewayStrategyChooser;

    public String initiatePayment(String name, String phoneNumber, String orderId, String email, Long amount){
        PaymentGateway paymentGateway = paymentGatewayStrategyChooser.getBestPaymentGateway();
        return paymentGateway.getPaymentLink(name, phoneNumber, orderId, email, amount);
    }
}
