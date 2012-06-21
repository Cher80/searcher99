package com.searcher9.client.mainmenu;



import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.searcher9.client.ClientFactory;
import com.searcher9.client.login.LoginPlace;
import com.searcher9.client.register.RegisterPlace;

public class MainMenu extends Composite {
	
	public MainMenu() {
		FlowPanel panel = new FlowPanel();
		
		Button myButt1 = new Button("OloloButt1");
		
		myButt1.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				ClientFactory.getPlaceController().goTo(new LoginPlace("composplace1"));
			}
		});
		
		Button myButt2 = new Button("OloloButt2");
		
		myButt2.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				ClientFactory.getPlaceController().goTo(new RegisterPlace("composplace1"));
			}
		});
		
		panel.add(myButt1);
		panel.add(myButt2);
		
		initWidget(panel);
	}
	
}
