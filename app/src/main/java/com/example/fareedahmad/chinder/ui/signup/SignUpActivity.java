package com.example.fareedahmad.chinder.ui.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.fareedahmad.chinder.R;
import com.example.fareedahmad.chinder.ui.signin.SignInActivity;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void signin(View view) {
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }

}
