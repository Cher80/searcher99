package com.searcher9.client;

import com.searcher9.shared.User;

public class UserController {
	private static UserController userControllerInstance;
	private User user = null;
	
	private UserController() {
		
	}
	
	public static UserController getInstance() {
		if (userControllerInstance == null) {
			userControllerInstance = new UserController();
		}
		return userControllerInstance;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public void doLogOut(User user) {
		//TODO
	}
	
	
	
	

}
