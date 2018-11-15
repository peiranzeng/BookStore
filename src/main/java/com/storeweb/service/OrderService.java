package com.storeweb.service;

import com.storeweb.domain.BillingAddress;
import com.storeweb.domain.Order;
import com.storeweb.domain.Payment;
import com.storeweb.domain.ShippingAddress;
import com.storeweb.domain.ShoppingCart;
import com.storeweb.domain.User;

public interface OrderService {

	Order createOrder(ShoppingCart shoppingCart, ShippingAddress shippingAddress, BillingAddress billingAddress,
			Payment payment, String shippingMethod, User user);
	
	Order findOne(Long id);

}
