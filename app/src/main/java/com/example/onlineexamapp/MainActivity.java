package com.example.onlineexamapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText username,pass;
    private Button login,register;
    private TextView forgotpass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       username =findViewById(R.id.Username);
       pass = findViewById(R.id.Password);
       login =findViewById(R.id.loginbtn);
       register=findViewById(R.id.Registerbtn);
       forgotpass=findViewById(R.id.fogpass);

       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               if (validateData())
               {
                   Login();
               }
           }
       });

    }
    private boolean validateData() {

        if (username.getText().toString().isEmpty()) {
            username.setError("Enter Username");
            return false;
        }
        if (pass.getText().toString().isEmpty()) {
            pass.setError("Enter Password");
            return false;

        }
        return true;
    }
    private void Login()
    {

    }
}
