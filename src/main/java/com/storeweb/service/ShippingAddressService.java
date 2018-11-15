package com.storeweb.service;

import com.storeweb.domain.ShippingAddress;
import com.storeweb.domain.UserShipping;

public interface ShippingAddressService {

	ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
	
}
