package com.storeweb.service;

import com.storeweb.domain.BillingAddress;
import com.storeweb.domain.UserBilling;

public interface BillingAddressService {

	BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);

}
