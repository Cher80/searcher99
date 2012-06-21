package com.searcher9.client.register;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;

public class RegisterView extends Composite  {

	 	SimplePanel viewPanel = new SimplePanel();
	    Element nameSpan = DOM.createSpan();

	    public RegisterView() {
	    	nameSpan.setInnerText("Good-bye, Register");
	        viewPanel.getElement().appendChild(nameSpan);
	        initWidget(viewPanel);
	    }



   // public void setPresenter(Presenter presenter) {
     //       this.presenter = presenter;
    //}
}
