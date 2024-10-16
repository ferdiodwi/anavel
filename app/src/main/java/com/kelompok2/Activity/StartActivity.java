package com.kelompok2.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.kelompok2.anavel.R;

public class StartActivity extends AppCompatActivity {

    Button btnLogin, btnRegister, btn_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        btnLogin = findViewById(R.id.btn_login_home);
        btnRegister = findViewById(R.id.btn_register_home);
        btn_list = findViewById(R.id.btn_list);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Login = new Intent(StartActivity.this, LoginActivity.class);
                startActivity(Login);
                //finish();
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Register = new Intent(StartActivity.this, RegisterActivity.class);
                startActivity(Register);
            }
        });

        btn_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent List = new Intent(StartActivity.this, ListMHSActivity.class);
                startActivity(List);
            }
        });
    }
}