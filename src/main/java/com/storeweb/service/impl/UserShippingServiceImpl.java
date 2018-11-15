package com.storeweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storeweb.domain.UserShipping;
import com.storeweb.repository.UserShippingRepository;
import com.storeweb.service.UserShippingService;

@Service
public class UserShippingServiceImpl implements UserShippingService {
	
	@Autowired
	private UserShippingRepository userShippingRepository;

	@Override
	public UserShipping findById(Long id) {
		// TODO Auto-generated method stub
		return userShippingRepository.findById(id).orElse(null);
	}

	@Override
	public void removeById(Long userShippingId) {
		// TODO Auto-generated method stub
		userShippingRepository.deleteById(userShippingId);
	}

}
