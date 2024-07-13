package com.amit.ecommerce.payment_service.paymentservice.paymentgateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayStrategyChooser {
    @Autowired
    private RazorpayPaymentGateway razorpayPaymentGateway; // if we want to change payment gateway then just replace this line

    public PaymentGateway getBestPaymentGateway() {
        return razorpayPaymentGateway;
    }
}
