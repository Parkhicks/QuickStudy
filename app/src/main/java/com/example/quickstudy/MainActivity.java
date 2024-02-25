package com.example.quickstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button createcard;
    Button study_menu;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void create_set_menu(View view){
        Intent intent=new Intent(MainActivity.this, create_set.class);
        startActivity(intent);
    }
    public void study_set(View view){
        Intent intent=new Intent(MainActivity.this, study_set.class);
        startActivity(intent);
    }
}