package com.example.rex.gameapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static android.R.attr.duration;
import static android.R.attr.name;
import static android.R.attr.onClick;
import static android.R.id.list;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static com.example.rex.gameapp.R.id.Players;
import static com.example.rex.gameapp.R.id.button;

import static com.example.rex.gameapp.R.id.players_list;
import static com.example.rex.gameapp.R.id.textView;

/**
 *
 *  Activity Player
 *
 *  This activity will get the number of players from the user
 *  It will also get the names of each player
 *
 * @ author  Adam Fletcher
 * @ author  Matthew Wilcox
 * @ author  Rex Nesbit
 *
 * @ Version 1.0
 */

public class Player extends AppCompatActivity {



    Button save;
    ArrayList<String> addArray = new ArrayList<String>();
    EditText txt;
    ListView show;

    private int numPlayers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        numPlayers = 1;

        txt = (EditText) findViewById(R.id.new_player);
        show = (ListView) findViewById(R.id.players_list);
        save = (Button) findViewById(R.id.addName);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getText = txt.getText().toString();

                if (addArray.contains(getText)) {
                    Toast.makeText(getBaseContext(), "Item Already Added", Toast.LENGTH_LONG).show();
                } else if (getText == null || getText.trim().equals("")) {
                    Toast.makeText(getBaseContext(), "Input Field is Empty", Toast.LENGTH_LONG).show();
                } else {
                    addArray.add(getText);
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(Player.this, android.R.layout.simple_list_item_1, addArray);
                    show.setAdapter(adapter);
                    ((EditText) findViewById(R.id.new_player)).setText(" ");
                }

            }
        });
    }


    /**
     * Set every die to its default status
     */
    private void resetPlayers() {

    }


    /**
     * Increments the number of Players by 1
     *
     * @param view The view to be altered
     */
    public void addPlayer(View view) {
        numPlayers++;
        if (numPlayers > 8)
            numPlayers = 8;

        TextView textView = (TextView) findViewById(R.id.numPlayers);
        textView.setText("" + numPlayers);

        resetPlayers();
    }

    /**
     * Decrements the number of dice to be rolled by 1
     *
     * @param view The view to be altered
     */
    public void removePlayer(View view) {
        numPlayers--;
        if (numPlayers < 1)
            numPlayers = 1;

        TextView textView = (TextView) findViewById(R.id.numPlayers);
        textView.setText("" + numPlayers);

        resetPlayers();
    }


}
