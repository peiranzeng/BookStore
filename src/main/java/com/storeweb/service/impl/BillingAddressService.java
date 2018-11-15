package com.storeweb.service.impl;

import org.springframework.stereotype.Service;

import com.storeweb.domain.BillingAddress;
import com.storeweb.domain.UserBilling;

@Service
public class BillingAddressService implements com.storeweb.service.BillingAddressService {

	@Override
	public BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress) {
		// TODO Auto-generated method stub
		
		billingAddress.setBillingAddressName(userBilling.getUserBillingName());
		billingAddress.setBillingAddressStreet1(userBilling.getUserBillingStreet1());
		billingAddress.setBillingAddressStreet2(userBilling.getUserBillingStreet2());
		billingAddress.setBillingAddressCity(userBilling.getUserBillingCity());
		billingAddress.setBillingAddressState(userBilling.getUserBillingState());
		billingAddress.setBillingAddressCountry(userBilling.getUserBillingCountry());
		billingAddress.setBillingAddressZipCode(userBilling.getUserBillingZipCode());
		
		return billingAddress;
	}

}
