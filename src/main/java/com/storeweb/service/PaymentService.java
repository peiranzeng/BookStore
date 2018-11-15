package com.storeweb.service;

import com.storeweb.domain.Payment;
import com.storeweb.domain.UserPayment;

public interface PaymentService {

	Payment setByUserPayment(UserPayment userPayment, Payment payment);

}
