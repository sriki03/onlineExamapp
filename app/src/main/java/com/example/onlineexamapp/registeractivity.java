package com.example.onlineexamapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class registeractivity extends AppCompatActivity {

    private EditText name,email,pass,confirmpass;
    private Button registerbtn;
    private ImageView backB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeractivity);

        name = findViewById(R.id.username);
        email = findViewById(R.id.email);
        pass =findViewById(R.id.Password);
        confirmpass = findViewById(R.id.confirmPassword);
        registerbtn = findViewById(R.id.Registerbtn);
        backB = findViewById(R.id.backbtn);

        backB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                registerNewUser();


            }
        });

    }
    private void registerNewUser()
    {

    }
}