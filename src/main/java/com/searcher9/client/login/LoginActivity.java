package com.searcher9.client.login;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.searcher9.client.ClientFactory;

public class LoginActivity extends AbstractActivity {
    // Used to obtain views, eventBus, placeController
    // Alternatively, could be injected via GIN
    private  ClientFactory clientFactory;
    // Name that will be appended to "Hello,"
    private String name;

    public LoginActivity(LoginPlace place) {
        this.name = place.getLoginName();
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
        containerWidget.setWidget(new LoginView().asWidget());
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