package com.searcher9.server;

import java.net.UnknownHostException;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.searcher9.client.rpcs.RPCSCommunicator;
import com.searcher9.client.rpcs.RPCSControllerExeption;
import com.searcher9.shared.ResponseHolder;
import com.searcher9.shared.User;

import com.mongodb.Mongo;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.MongoException;

public class RPCSControllerImpl extends RemoteServiceServlet implements
		RPCSCommunicator {

	@Override
	public User registerNewUser(String email, String firstName,
			String lastName, String password) throws RPCSControllerExeption {
		// TODO Auto-generated method stub
		Mongo m;
		try {
			m = new Mongo( "78.47.43.153" , 27017 );
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new RPCSControllerExeption("Mongo UnknownHostException" + e);
		} catch (MongoException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new RPCSControllerExeption("Mongo MongoException" + e);
		}
		DB db = m.getDB( "admin" );
		boolean auth = db.authenticate("root", "37cher83".toCharArray());
		db = m.getDB( "test" );
		DBCollection coll = db.getCollection("thngs");
		DBObject myDoc = coll.findOne();
		/*
		
		//DBCollection collection = db.getCollection("yourCollection");
		
		*/
		User user = new User();
		user.setEmail("andrew.uglev@gmail.com");
		user.setFirstName(myDoc.toString());
		//user.setFirstName("Andrew");
		user.setLastName("Uglev");
		user.setSessionID("12323");
		user.setToken("12312321");
		user.setUid("9");
		//ResponseHolder responseHolder = new ResponseHolder();
		//responseHolder.setResponseData(user);
		//responseHolder.setResponseStatus("ok");
		//responseHolder.setResponseDesription("well done");
		
		///Test error handling
		//if (true)
		//throw new RPCSControllerExeption("Eto strashnaya oshibka");

		return user;
	}

}
