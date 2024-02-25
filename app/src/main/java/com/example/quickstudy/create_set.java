package com.example.quickstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class create_set extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_set);

    }
    public void done_creating(View view){
        Intent intent=new Intent(create_set.this, MainActivity.class);
        startActivity(intent);
    }

    public void create(View view){


        TextView questionTV = (TextView) findViewById(R.id.Question);
        TextView answerTV = (TextView) findViewById(R.id.Answer);

        String question = questionTV.getText().toString();
        String answer = answerTV.getText().toString();

        card card = new card(question,answer);

        container.addCardToArray(card);

        questionTV.setText("");
        answerTV.setText("");
    }


}