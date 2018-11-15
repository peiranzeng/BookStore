package com.storeweb.service;

import java.util.Set;

import com.storeweb.domain.User;
import com.storeweb.domain.UserBilling;
import com.storeweb.domain.UserPayment;
import com.storeweb.domain.UserShipping;
import com.storeweb.domain.security.PasswordResetToken;
import com.storeweb.domain.security.UserRole;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);

	User findByUsername(String username);
	
	User findByEmail(String email);

	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);

	void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);

	void setUserDefaultPayment(Long userPaymentId, User user);

	void updateUserShipping(UserShipping userShipping, User user);

	void setUserDefaultShipping(Long defaultShippingId, User user);

	User findById(Long id);
}
