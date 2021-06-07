package com.example.locoflow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class otpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //below line is to hide the appbar, and this should be placed before the setContentView
        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp_activity);

        EditText otp = findViewById(R.id.otpEditText);
        Button submit = findViewById(R.id.submitButton);

        submit.setOnClickListener(v->{
            if(otp.getText().length()==6){
                startActivity(new Intent(otpActivity.this,homeActivity.class));
                finish();
            }
        });
    }
}