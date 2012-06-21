package com.searcher9.client.rpcs;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.searcher9.shared.ResponseHolder;
import com.searcher9.shared.User;

@RemoteServiceRelativePath("communicator")
public interface RPCSCommunicator extends RemoteService {
	
 	User registerNewUser(String email, String firstName, String lastName, String password) throws RPCSControllerExeption;
	
}
