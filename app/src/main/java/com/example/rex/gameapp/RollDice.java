package com.example.rex.gameapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

/**
 * Activity for rolling dice
 *
 * This activity is a utility for generating random numbers based on the possibilities
 * of a desired number of 6-sided dice.
 *
 * @author      Rex Nesbit
 * @author      Adam Fletcher
 * @author      Matthew Wilcox
 * @version     1.0
 * @since       1.0
 */
public class RollDice extends AppCompatActivity {

    private int numDice;

    /**
     * Generates the activity's initial state
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.roll_dice);

        numDice = 1;
        TextView textView = (TextView) findViewById(R.id.numDice);
        textView.setText("" + numDice);
    }

    /**
     * Rolls the number of desired dice
     *
     * @param view the received view to be altered
     */
    public void rollDice(View view) {
        // Loop through and random for each numDice.
        // Display each result to the gridView.
        String temp;
        Random random = new Random();

        for (int i = 1; i <= numDice; i++){
            for (int j = 0; j < random.nextInt(6) + 3; j++) {
                random.nextInt(6);
            }

            temp = String.valueOf(random.nextInt(6) + 1);

            changeDie(i, temp);
        }
    }

    /**
     * Changes a target die.
     *
     * @param i the position number of the die to be changed
     * @param temp the data to edit the die with
     */
    private void changeDie(int i, String temp) {
        TextView textView;
        switch (i) {
            case 1:
                textView = (TextView) findViewById(R.id.Die1);
                textView.setText("" + temp);
                break;
            case 2:
                textView = (TextView) findViewById(R.id.Die2);
                textView.setText("" + temp);
                break;
            case 3:
                textView = (TextView) findViewById(R.id.Die3);
                textView.setText("" + temp);
                break;
            case 4:
                textView = (TextView) findViewById(R.id.Die4);
                textView.setText("" + temp);
                break;
            case 5:
                textView = (TextView) findViewById(R.id.Die5);
                textView.setText("" + temp);
                break;
            case 6:
                textView = (TextView) findViewById(R.id.Die6);
                textView.setText("" + temp);
                break;
            case 7:
                textView = (TextView) findViewById(R.id.Die7);
                textView.setText("" + temp);
                break;
            case 8:
                textView = (TextView) findViewById(R.id.Die8);
                textView.setText("" + temp);
                break;
            case 9:
                textView = (TextView) findViewById(R.id.Die9);
                textView.setText("" + temp);
                break;
        }
    }

    /**
     * Set every die to its default status
     */
    private void resetDice() {
        TextView textView = (TextView) findViewById(R.id.Die1);
        textView.setText("~");
        textView = (TextView) findViewById(R.id.Die2);
        textView.setText("~");
        textView = (TextView) findViewById(R.id.Die3);
        textView.setText("~");
        textView = (TextView) findViewById(R.id.Die4);
        textView.setText("~");
        textView = (TextView) findViewById(R.id.Die5);
        textView.setText("~");
        textView = (TextView) findViewById(R.id.Die6);
        textView.setText("~");
        textView = (TextView) findViewById(R.id.Die7);
        textView.setText("~");
        textView = (TextView) findViewById(R.id.Die8);
        textView.setText("~");
        textView = (TextView) findViewById(R.id.Die9);
        textView.setText("~");
    }

    /**
     * Increments the number of dice to be rolled by 1
     *
     * @param view The view to be altered
     */
    public void addDie(View view) {
        numDice++;
        if (numDice > 9)
            numDice = 9;

        TextView textView = (TextView) findViewById(R.id.numDice);
        textView.setText("" + numDice);

        resetDice();
    }

    /**
     * Decrements the number of dice to be rolled by 1
     *
     * @param view The view to be altered
     */
    public void removeDie(View view) {
        numDice--;
        if (numDice < 1)
            numDice = 1;

        TextView textView = (TextView) findViewById(R.id.numDice);
        textView.setText("" + numDice);

        resetDice();
    }
}