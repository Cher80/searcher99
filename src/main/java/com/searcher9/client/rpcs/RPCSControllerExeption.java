package com.searcher9.client.rpcs;

import java.io.Serializable;

public class RPCSControllerExeption extends RuntimeException implements Serializable {
	
	private String errorCode;
	
	public  RPCSControllerExeption() {};
	
	public  RPCSControllerExeption(String errorCode) {
		//super();
		this.errorCode = errorCode;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
}	
