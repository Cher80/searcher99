package com.searcher9.client;


import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.shared.EventBus;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.searcher9.client.login.LoginPlace;
import com.searcher9.client.mainmenu.MainMenu;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Searcher9 implements EntryPoint {
	private MainLayout mainLayout = new MainLayout(); 
//	private DockLayoutPanel panel = new DockLayoutPanel(Unit.PX);

	public void onModuleLoad() {
		
		
		// Add a handler to send the name to the server
		//TextButton b = new TextButton("Button sencha");
		//RootPanel.get("main_content").add(b);
		
		RootLayoutPanel.get().add(mainLayout);
		
		MainMenu mainMenu = new MainMenu();
		mainLayout.getMenuPanel().add(mainMenu);
		
		EventBus eventBus = ClientFactory.getEventBus();
        PlaceController placeController = ClientFactory.getPlaceController();
        
        ActivityMapper activityMapper = new AppActivityMapper();
        ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
        activityManager.setDisplay((AcceptsOneWidget) mainLayout.getContentPanel().asWidget());
		
        Place defaultPlace = new LoginPlace("World!");
        
        AppPlaceHistoryMapper historyMapper= GWT.create(AppPlaceHistoryMapper.class);
        PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
        historyHandler.register(placeController, eventBus, defaultPlace);
		
        historyHandler.handleCurrentHistory();
		//RootPanel.get().add(panel);
		
	
	}
}
