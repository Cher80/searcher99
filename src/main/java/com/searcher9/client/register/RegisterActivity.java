package com.searcher9.client.register;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.searcher9.client.ClientFactory;

public class RegisterActivity extends AbstractActivity {
    // Used to obtain views, eventBus, placeController
    // Alternatively, could be injected via GIN
    private  ClientFactory clientFactory;
    // Name that will be appended to "Hello,"
    private String name;

    public RegisterActivity(RegisterPlace place) {
        this.name = place.getRegisterName();
        //this.clientFactory = ClientFactory.class;
    }

    /**
     * Invoked by the ActivityManager to start a new Activity
     */
    @Override
    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
        //HelloView helloView = clientFactory.getHelloView();
        //helloView.setName(name);
        //helloView.setPresenter(this);
        containerWidget.setWidget(new RegisterView().asWidget());
    }

    /**
     * Ask user before stopping this activity
     */
    @Override
    public String mayStop() {
        //return "Please hold on. This activity is stopping.";
    	return null;
    }


}