package com.example.quickstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class study_set extends AppCompatActivity {
    int index = 0;
    public void home(View view){
        Intent intent=new Intent(study_set.this, MainActivity.class);
        startActivity(intent);
    }

    private static ArrayList<card> cards = container.getcards();

    public void flip(View view){
        TextView displayTV = findViewById(R.id.display);
        String display = displayTV.getText().toString();
        for (card card : cards) {
            if (display.equals(card.getQuestion())) {
                displayTV.setText(card.getAnswer());
            } else if (display.equals(card.getAnswer())) {
                displayTV.setText(card.getQuestion());
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_set);
        Collections.shuffle(cards);
        TextView displayTV = findViewById(R.id.display);
        card first = cards.get(0);
        displayTV.setText(first.getQuestion());



    }
    private void updateDisplay() {
        TextView displayTV = findViewById(R.id.display);
        card currentCard = cards.get(index);
        displayTV.setText(currentCard.getQuestion());
    }
    public void next(View view){
        if (index == (cards.size()-1 )){
            index = 0;
            updateDisplay();
        }
        else{
            index = index+1;
            updateDisplay();
        }
    }
    public void back(View view){
        if (index == 0 ){
            index = (cards.size()-1);
            updateDisplay();
        }
        else{
            index = index-1;
            updateDisplay();
        }
    }
}