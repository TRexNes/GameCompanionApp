package com.example.rex.gameapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Activity for navigating to other activities
 *
 * @author      Rex Nesbit
 * @author      Adam Fletcher
 * @author      Matthew Wilcox
 * @version     1.0
 * @since       1.0
 */
public class MainActivity extends AppCompatActivity {

    // This is a test of the push.
    //Testing again

    /**
     * Generates the initial activity's state
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Opens the RollDice activity
     *
     * @param view the received view
     */
    public void openRollDice(View view) {
        Intent intent = new Intent(this, RollDice.class);

        startActivity(intent);
    }

    /**
     * Opens the Player activity
     *
     * @param view the received view
     */
    public void openPlayer(View view) {
        Intent intent = new Intent(this, Player.class);

        startActivity(intent);
    }

    /**
     * Opens the Timer activity
     *
     * @param view the received view
     */
    public void openTimer(View view) {
        Intent intent = new Intent(this, Timer.class);

        startActivity(intent);
    }
}
