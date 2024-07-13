package com.amit.ecommerce.payment_service.paymentservice.configurations;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorPayConfig {
    @Value("${razorpay_id}") // @Value is used to get value from application.properties
    private String razorPayId;
    @Value("${razorpay_secret}")
    private String razorPaySecret;

    @Bean
    RazorpayClient getRazorPayClient() throws RazorpayException {
        return new RazorpayClient(razorPayId, razorPaySecret);
    }
}
