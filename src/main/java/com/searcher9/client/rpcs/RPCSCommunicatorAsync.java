package com.searcher9.client.rpcs;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.searcher9.shared.ResponseHolder;
import com.searcher9.shared.User;

public interface RPCSCommunicatorAsync {

	void registerNewUser(String email, String firstName, String lastName,
			String password, AsyncCallback<User> callback);
	
}

