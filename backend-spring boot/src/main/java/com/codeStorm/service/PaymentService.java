package com.codeStorm.service;

import com.stripe.exception.StripeException;
import com.codeStorm.model.Order;
import com.codeStorm.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
