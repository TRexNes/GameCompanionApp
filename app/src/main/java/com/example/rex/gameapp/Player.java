package com.example.rex.gameapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.name;
import static android.R.id.list;
import static com.example.rex.gameapp.R.id.new_player_name;
import static com.example.rex.gameapp.R.id.textView;

public class Player extends AppCompatActivity {

    int numPlayers = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

    }

    /**
     *
     * @param view will allow user to increase number of players
     */
    public void increment(View view) {

        numPlayers = numPlayers + 1;
        displayNumPlay(numPlayers);
    }

    /**
     *
     * @param view allow user to decrese numbers of players
     */
    public void decrement(View view) {

        numPlayers = numPlayers - 1;
        displayNumPlay(numPlayers);
    }

    /**
     *
     * @param numPlayers displays the quatnity of players chosen by user
     */
    private void displayNumPlay(int numPlayers) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numPlayers);
    }





}
