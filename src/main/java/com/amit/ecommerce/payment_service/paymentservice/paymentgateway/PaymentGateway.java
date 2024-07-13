package com.amit.ecommerce.payment_service.paymentservice.paymentgateway;

public interface PaymentGateway {
    String getPaymentLink(String name, String phoneNumber, String orderId, String email, Long amount);
}
