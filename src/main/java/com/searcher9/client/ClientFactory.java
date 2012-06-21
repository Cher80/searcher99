package com.searcher9.client;


import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;


public class ClientFactory {
    private final static EventBus eventBus = new SimpleEventBus();
    private final static PlaceController placeController = new PlaceController(eventBus);
 //   private final HelloView helloView = new HelloViewImpl();
 //   private final GoodbyeView goodbyeView = new GoodbyeViewImpl();

    public static EventBus getEventBus() {
        return eventBus;
    }

    public static PlaceController getPlaceController() {
        return placeController;
    }
    
}
