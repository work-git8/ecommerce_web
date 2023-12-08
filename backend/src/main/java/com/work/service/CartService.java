package com.work.service;

import com.work.exception.ProductException;
import com.work.model.Cart;
import com.work.model.User;
import com.work.request.AddItemRequest;

public interface CartService {

	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);
}
