package com.codeStorm.service;

import com.codeStorm.Exception.CartException;
import com.codeStorm.Exception.CartItemException;
import com.codeStorm.Exception.FoodException;
import com.codeStorm.Exception.UserException;
import com.codeStorm.model.Cart;
import com.codeStorm.model.CartItem;
import com.codeStorm.request.AddCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
