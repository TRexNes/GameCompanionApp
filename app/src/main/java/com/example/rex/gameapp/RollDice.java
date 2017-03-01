package com.example.rex.gameapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RollDice extends AppCompatActivity {

    private int numDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.roll_dice);

        numDice = 2;
    }

    void rollDice() {
        // Loop through and random for each numDice.
        // Display each result to the gridView.
    }

    int getNumDice() {
        return numDice;
    }

    void addDie() {
        numDice++;
    }

    void removeDie() {
        numDice--;
    }
}
