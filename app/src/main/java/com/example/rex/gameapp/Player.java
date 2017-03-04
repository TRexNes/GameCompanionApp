package com.example.rex.gameapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Player extends AppCompatActivity {

    int numPlayers = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
    }

    public void addPLayer(View view) {
        EditText nameInput = (EditText) findViewById(R.id.new_player_name);
        String name = nameInput.getText().toString();

    }
    public void increment(View view) {

        numPlayers = numPlayers + 1;
        displayNumPlay(numPlayers);
    }
    public void decrement(View view) {

        numPlayers = numPlayers - 1;
        displayNumPlay(numPlayers);
    }

    private void displayNumPlay(int numPlayers) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numPlayers);
    }

    public void removePlayer(View view) {

    }

    public void resetPlayer(View view) {

    }

}
