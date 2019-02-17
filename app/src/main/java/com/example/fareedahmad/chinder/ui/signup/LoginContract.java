package com.example.fareedahmad.chinder.ui.signup;

public interface LoginContract {

    interface View {
        void nextScreen();
    }

    interface Presenter {
        void postUserData(String body);
    }
}
