package com.searcher9.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.searcher9.client.login.LoginActivity;
import com.searcher9.client.login.LoginPlace;
import com.searcher9.client.register.RegisterActivity;
import com.searcher9.client.register.RegisterPlace;

public class AppActivityMapper implements ActivityMapper {
    private ClientFactory clientFactory;

    public AppActivityMapper() {
        //super();
        //this.clientFactory = clientFactory;
    }
    @Override
    public Activity getActivity(Place place) {
        if (place instanceof LoginPlace)
            return new LoginActivity((LoginPlace) place);
        else if (place instanceof RegisterPlace)
            return new RegisterActivity((RegisterPlace) place);

        return null;
    }
}