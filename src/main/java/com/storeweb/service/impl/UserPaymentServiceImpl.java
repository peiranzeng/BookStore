package com.storeweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storeweb.domain.UserPayment;
import com.storeweb.repository.UserPaymentRepository;
import com.storeweb.service.UserPaymentService;

@Service
public class UserPaymentServiceImpl implements UserPaymentService {
	
	@Autowired UserPaymentRepository userPaymentRepository;
	@Override
	public UserPayment findById(Long id) {
		
		return userPaymentRepository.findById(id).orElse(null);
	}
	@Override
	public void removeById(Long id) {
		// TODO Auto-generated method stub
		userPaymentRepository.deleteById(id);
	}

}
