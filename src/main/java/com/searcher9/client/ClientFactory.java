package com.searcher9.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;

public class ClientFactory {
    private final static EventBus EVENT_BUS = new SimpleEventBus();
    private final static PlaceController PLACE_CONTROLLER = new PlaceController(EVENT_BUS);
 //   private final HelloView helloView = new HelloViewImpl();
 //   private final GoodbyeView goodbyeView = new GoodbyeViewImpl();

    public static EventBus getEventBus() {
        return EVENT_BUS;
    }

    public static PlaceController getPlaceController() {
        return PLACE_CONTROLLER;
    }
    
}
