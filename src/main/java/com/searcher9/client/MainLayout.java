package com.searcher9.client;


//import at.wizzart.gwt.widgets.client.CodeMirror;
//import at.wizzart.gwt.widgets.client.CodeMirrorConfiguration;
//import at.wizzart.gwt.widgets.client.event.logical.SaveEvent;
//import at.wizzart.gwt.widgets.client.event.logical.SaveHandler;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.logical.shared.InitializeEvent;
import com.google.gwt.event.logical.shared.InitializeHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class MainLayout extends Composite {
	
	/*
	 CodeMirror editor;
     CodeMirrorConfiguration config = new CodeMirrorConfiguration();
	
	private BorderLayoutContainer panel = new BorderLayoutContainer();
	private Viewport viewport = new Viewport();
	private LayoutPanel panel = new LayoutPanel();
	*/
	private DockLayoutPanel panel = new DockLayoutPanel(Unit.PX);
	private ScrollPanel sp = new ScrollPanel();
	private ScrollPanel menuPanel = new ScrollPanel();
	
	public MainLayout() {
		// TODO Auto-generated method stub
		
		
		/*
		panel.setBorders(true);
	    ContentPanel north = new ContentPanel();
	    ContentPanel west = new ContentPanel();
	    ContentPanel center = new ContentPanel();
	    ContentPanel south = new ContentPanel();
	    ContentPanel east = new ContentPanel();
	    
	    BorderLayoutData northData = new BorderLayoutData(100);
	    northData.setMargins(new Margins(5));
	    northData.setCollapsible(true);
	    northData.setSplit(true);
	 
	    BorderLayoutData westData = new BorderLayoutData(150);
	    westData.setCollapsible(true);
	    westData.setSplit(true);
	    westData.setCollapseMini(true);
	    westData.setMargins(new Margins(0, 5, 0, 5));
	 
	    MarginData centerData = new MarginData();
	 
	    BorderLayoutData eastData = new BorderLayoutData(150);
	    eastData.setMargins(new Margins(0, 5, 0, 5));
	    eastData.setCollapsible(true);
	    eastData.setSplit(true);
	 
	    BorderLayoutData southData = new BorderLayoutData(100);
	    southData.setMargins(new Margins(5));
	    southData.setCollapsible(true);
	    southData.setCollapseMini(true);
	 
	    panel.setNorthWidget(north, northData);
	    panel.setWestWidget(west, westData);
	    panel.setCenterWidget(center, centerData);
	    panel.setEastWidget(east, eastData);
	    panel.setSouthWidget(south, southData);
	 
//	    SimpleContainer simple = new SimpleContainer();
//	    simple.add(panel, new MarginData(10));
	    
	    center.setHeadingText("BorderLayout Example");
		//TextButton b = new TextButton("Button sencha2");
		//center.add(b);
	    
	    
	   
    
        config.setLineNumbers(true);
        config.setContinuousScanning(0);
        config.setTextWrapping(false);
        config.setAutoMatchParens(false);
                //config.setStyleSheetURL(GWT.getModuleBaseURL() + "/css/test.css");
        editor = new CodeMirror(config);
        editor.setHeight("100%");
        editor.setWidth("400px");
                
        editor.addInitializeHandler(new InitializeHandler() {
                        public void onInitialize(InitializeEvent event) {
                                editor.setParser(CodeMirror.PARSER_PHP_HTML_MIXED);
                                editor.setLineNumbers(true);
                                //editor.setTextWrapping(true);
                                editor.setIndentUnit(2);
                                //editor.setStylesheetURL(GWT.getModuleBaseURL() + "/css/test.css");
                                editor.setFocus();
                                //editor.setSelection("body { \nmargin: 0px; \n}");
                                editor.reindent();
                        }
                });
                
        editor.addSaveHandler(new SaveHandler() {
                        public void onSave(SaveEvent event) {
                                Window.alert("saved!");
                        }
                });
                
        center.add(editor);
	   
	    viewport.add(panel);*/
		
		/*
		Button b = new Button("Button sencha2");
		
		LayoutPanel p1 = new LayoutPanel();
		LayoutPanel p2 = new LayoutPanel();
		
		p1.getElement().getStyle().setProperty("border", "1px solid green");
		p2.getElement().getStyle().setProperty("border", "1px solid orange");

		panel.add(p1);
		panel.add(p2);
		
		panel.getElement().getStyle().setProperty("border", "1px solid red");
		panel.setHeight("200px");
		
		//panel.add(b);
		panel.setWidgetLeftWidth(p1, 0, Unit.PCT, 50, Unit.PCT);
		panel.setWidgetRightWidth(p2, 0, Unit.PCT, 50, Unit.PCT);
		
		//panel.setWidgetLeftRight(p1, 0, Unit.PCT, 30, Unit.PCT);
		//panel.setWidgetLeftRight(p1, 0, Unit.PCT, 30, Unit.PCT);
		*/
		Button b = new Button("Button sencha2");
		
		//panel.setHeight("600PX");
		panel.addNorth(new HTML("header"), 50);
		panel.addSouth(new HTML("footer"), 50);
		panel.addWest(menuPanel, 100);
		panel.addEast(new HTML("notifications"), 100);
		panel.add(sp);
		//panel.get
		
		panel.getElement().getStyle().setProperty("border", "1px solid red");
		initWidget(panel);
	}
	
	public Panel getContentPanel() {
		return sp;
	}
	
	public Panel getMenuPanel() {
		return menuPanel;
	}
	

}
