package com.searcher9.client.login;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.searcher9.client.ClientFactory;
import com.searcher9.client.rpcs.RPCSCommunicator;
import com.searcher9.client.rpcs.RPCSCommunicatorAsync;
import com.searcher9.shared.ResponseHolder;
import com.searcher9.shared.User;

public class LoginView extends Composite  {

		FlowPanel viewPanel = new FlowPanel();
	    Element nameSpan = DOM.createSpan();

	    public LoginView() {
	    	nameSpan.setInnerText("Login");
	        viewPanel.getElement().appendChild(nameSpan);
	        //FlowPanel panel = new FlowPanel();
	        
			
			Button myButt1 = new Button("Login");
			viewPanel.add(myButt1);
			
			myButt1.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					RPCSCommunicatorAsync communicatorSvc = GWT.create(RPCSCommunicator.class);

					// Set up the callback object.
				    AsyncCallback<ResponseHolder> callback = new AsyncCallback<ResponseHolder>() {
				    	public void onFailure(Throwable caught) {
		    					// TODO: Do something with errors.
				    		}

				    	@Override
				    	public void onSuccess(ResponseHolder result) {
				    		// TODO Auto-generated method stub
				    	}
				    };

				    // Make the call to the stock price service.
				    communicatorSvc.registerNewUser("as","sd","da","as", callback);
				    
				}
			});
	        initWidget(viewPanel);
	    }



   // public void setPresenter(Presenter presenter) {
     //       this.presenter = presenter;
    //}
}
