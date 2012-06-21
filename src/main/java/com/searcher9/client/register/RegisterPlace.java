package com.searcher9.client.register;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class RegisterPlace extends Place {
    private String helloName;

    public RegisterPlace(String token) {
        this.helloName = token;
    }

    public String getRegisterName() {
        return helloName;
    }

    public static class Tokenizer implements PlaceTokenizer<RegisterPlace> {
        @Override
        public String getToken(RegisterPlace place) {
            return place.getRegisterName();
        }

        @Override
        public RegisterPlace getPlace(String token) {
            return new RegisterPlace(token);
        }
    }
}
