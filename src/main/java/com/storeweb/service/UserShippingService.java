package com.storeweb.service;

import com.storeweb.domain.UserShipping;

public interface UserShippingService {
	UserShipping findById(Long id);

	void removeById(Long userShippingId);
}
