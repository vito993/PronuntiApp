package com.firefighters.pronuntiapp;

import android.os.Bundle;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.firefighters.pronuntiapp.databinding.ActivitySignUpBinding;

import java.util.Calendar;

public class SignUp extends AppCompatActivity {

private ActivitySignUpBinding binding;
    Button sendBtn;
    EditText i1;
    EditText i2;
    EditText i3;
    EditText i4;
    EditText i5;
    DatePicker i6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     binding = ActivitySignUpBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());
        sendBtn = findViewById(R.id.send);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //registrazione invio dati
            }
        });
        i1 = findViewById(R.id.name);
        i1.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                verifySignup();
            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });
        i2 = findViewById(R.id.surname);
        i2.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                verifySignup();
            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });
        i3 = findViewById(R.id.password);
        i3.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                verifySignup();
            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });
        i4 = findViewById(R.id.repassword);
        i4.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                verifySignup();
            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });
        i5 = findViewById(R.id.email);
        i5.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                verifySignup();
            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });
        i6 = findViewById(R.id.birthDate);

    }

    public void verifySignup(){
        if(i1.getText().toString().compareTo("")!=0 && i2.getText().toString().compareTo("")!=0 && i3.getText().toString().compareTo("")!=0 && i4.getText().toString().compareTo("")!=0 && i5.getText().toString().compareTo("")!=0){
            sendBtn.setEnabled(true);
        }
    }
}