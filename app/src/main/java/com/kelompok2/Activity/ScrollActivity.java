package com.kelompok2.Activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

import com.kelompok2.anavel.R;

public class ScrollActivity extends AppCompatActivity {

    private CardView btn_contacts;
    private CardView btn_settings;
    private CardView btn_folder;
    private CardView btn_camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scroll);
        btn_contacts = findViewById(R.id.btn_contact);
        btn_settings = findViewById(R.id.btn_settings);
        btn_folder = findViewById(R.id.btn_folder);
        btn_camera = findViewById(R.id.btn_camera);


        btn_contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Hallo ini Button Settings", Toast.LENGTH_SHORT).show();
//                Intent Login = new Intent(ScrollActivity.this, StartActivity.class);
//                startActivity(Login);
            }
        });


        btn_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Hallo ini Button Settings", Toast.LENGTH_SHORT).show();
//                Intent Login = new Intent(ScrollActivity.this, MainActivity.class);
//                startActivity(Login);
            }
        });


        btn_folder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Hallo ini Button Settings", Toast.LENGTH_SHORT).show();
//                Intent Login = new Intent(ScrollActivity.this, MainActivity.class);
//                startActivity(Login);
            }
        });


        btn_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Hallo ini Button Camera", Toast.LENGTH_SHORT).show();
//                Intent Login = new Intent(ScrollActivity.this, MainActivity.class);
//                startActivity(Login);
            }
        });


    }
}