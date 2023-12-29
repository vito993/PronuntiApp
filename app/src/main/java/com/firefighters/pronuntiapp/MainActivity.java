package com.firefighters.pronuntiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView goToSingUpButton;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.loginBtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //login
            }
        });
        goToSingUpButton = findViewById(R.id.goToSignupButton);
        goToSingUpButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openSignUp();
            }
        });
    }
    public void openSignUp(){
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}