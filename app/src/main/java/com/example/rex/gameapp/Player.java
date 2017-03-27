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
    double score;
    String name;
    List<Player> players;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        players = new ArrayList<>();
    }
}
