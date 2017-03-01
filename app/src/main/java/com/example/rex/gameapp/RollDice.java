package com.example.rex.gameapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class RollDice extends AppCompatActivity {

    private int numDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.roll_dice);

        numDice = 2;
    }

    public void rollDice() {
        // Loop through and random for each numDice.
        // Display each result to the gridView.
    }

    public int getNumDice() {
        return numDice;
    }

    public void addDie(View view) {
        numDice++;
    }

    public void removeDie(View view) {
        numDice--;
    }
}
