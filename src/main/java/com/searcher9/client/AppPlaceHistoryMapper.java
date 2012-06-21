package com.searcher9.client;



import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.searcher9.client.login.LoginPlace;
import com.searcher9.client.register.RegisterPlace;

@WithTokenizers({LoginPlace.Tokenizer.class,RegisterPlace.Tokenizer.class})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {

}