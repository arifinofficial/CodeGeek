package com.fins.codegeek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    TextView    eTuser, eTpass;
    Button      loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        eTuser      = (EditText) findViewById(R.id.eTuser);
        eTpass      = (EditText) findViewById(R.id.eTpass);
        loginBtn    = (Button) findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Selamat datang, "+eTuser.getText(), Toast.LENGTH_SHORT).show();
                Intent IntentLogin = new Intent(LoginActivity.this, ListActivity.class);
                startActivity(IntentLogin);
            }
        });
    }
}
