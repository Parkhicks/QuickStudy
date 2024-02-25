package com.example.quickstudy;

import android.widget.TextView;

import java.util.ArrayList;

public class container {
    // creating a list of all the cards
    private static ArrayList<card> cards = new ArrayList<>();

    // function to add cards into the private list
    public static void addCardToArray(card card){
        cards.add(card);
    }

    //function to get called in other classes and get cards
    public static ArrayList<card> getcards(){
        return cards;
    }
}
