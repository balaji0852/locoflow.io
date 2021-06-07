package com.example.locoflow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.example.locoflow.R;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //below line is to hide the appbar, and this should be placed before the setContentView
        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        EditText phone = findViewById(R.id.phoneEditText);
        Button login = findViewById(R.id.loginButton);

        login.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(phone.getText().length()==10){
                    startActivity(new Intent(loginActivity.this,otpActivity.class));
                }
            }
        });
    }
}