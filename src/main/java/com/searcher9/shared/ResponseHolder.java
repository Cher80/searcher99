package com.searcher9.shared;

import java.io.Serializable;

public class ResponseHolder implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String responseStatus;   //ok or smth else
	private String responseDesription;
	private Serializable responseData;
	
	public ResponseHolder() {
		
	}
	
	public String getResponseStatus() {
		return responseStatus;
	}
	
	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}
	
	public String getResponseDesription() {
		return responseDesription;
	}
	
	public void setResponseDesription(String responseDesription) {
		this.responseDesription = responseDesription;
	}
	
	public Serializable getResponseData() {
		return responseData;
	}
	
	public void setResponseData(Serializable responseData) {
		this.responseData = responseData;
	}
	
	
}
