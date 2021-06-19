package fiftDayHomework.core.abstracts;

import fiftDayHomework.googleİntegratedApi.GoogleApi;

public class AuthServiceManager implements AuthServiceAdapter{

    @Override
    public void login(String email) {
        GoogleApi googleApi = new GoogleApi();
        googleApi.login(email);
    }

    @Override
    public void register(String email) {
        GoogleApi googleApi = new GoogleApi();
        googleApi.register(email);
    }
}
