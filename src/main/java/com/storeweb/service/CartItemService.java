package com.storeweb.service;

import java.util.List;

import com.storeweb.domain.Book;
import com.storeweb.domain.CartItem;
import com.storeweb.domain.Order;
import com.storeweb.domain.ShoppingCart;
import com.storeweb.domain.User;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

	CartItem updateCartItem(CartItem cartItem);

	CartItem addBookToCartItem(Book book, User user, int qty);

	CartItem findById(Long cartItemId);

	void removeCartItem(CartItem cartItem);

	CartItem save(CartItem cartItem);

	List<CartItem> findByOrder(Order order);
}
