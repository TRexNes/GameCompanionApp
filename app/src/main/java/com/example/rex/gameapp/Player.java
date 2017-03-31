package com.example.rex.gameapp;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

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
    int score1;
    int score2;
    int score3;
    int score4;
    int score5;
    int score6;

    String name1;
    String name2;
    String name3;
    String name4;
    String name5;
    String name6;

    int addScore;

    int editPlayer;
    Spinner spinner;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        createSpinner();
        createPlayerDisplay();

        RadioButton radio = (RadioButton)findViewById(R.id.radio1);
        radio.setChecked(true);
        addScore = 1;
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio1:
                if (checked)
                    addScore = 1;
                    break;
            case R.id.radio10:
                if (checked)
                    addScore = 10;
                    break;
            case R.id.radio100:
                if (checked)
                    addScore = 100;
                    break;
            case R.id.radio1000:
                if (checked)
                    addScore = 1000;
                    break;
        }
    }

    private void createPlayerDisplay() {
        score1 = 0;
        score2 = 0;
        score3 = 0;
        score4 = 0;
        score5 = 0;
        score6 = 0;
        name1 = "Player";
        name2 = "Player";
        name3 = "Player";
        name4 = "Player";
        name5 = "Player";
        name6 = "Player";

        setPlayer();
    }

    private void setPlayer() {
        TextView view = (TextView)findViewById(R.id.player1);
        view.setText("1 " + name1 + "\nScore: " + score1);
        view = (TextView)findViewById(R.id.player2);
        view.setText("2 " + name2 + "\nScore: " + score2);
        view = (TextView)findViewById(R.id.player3);
        view.setText("3 " + name3 + "\nScore: " + score3);
        view = (TextView)findViewById(R.id.player4);
        view.setText("4 " + name4 + "\nScore: " + score4);
        view = (TextView)findViewById(R.id.player5);
        view.setText("5 " + name5 + "\nScore: " + score5);
        view = (TextView)findViewById(R.id.player6);
        view.setText("6 " + name6 + "\nScore: " + score6);
    }

    public void createSpinner() {
        spinner = (Spinner) findViewById(R.id.editPlayerSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.players_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View selectedItemView, int pos, long id) {
                String item = (String)parent.getItemAtPosition(pos);

                if (Objects.equals(item, "Player 1")) { editPlayer = 1; }
                else if (Objects.equals(item, "Player 2")) { editPlayer = 2; }
                else if (Objects.equals(item, "Player 3")) { editPlayer = 3; }
                else if (Objects.equals(item, "Player 4")) { editPlayer = 4; }
                else if (Objects.equals(item, "Player 5")) { editPlayer = 5; }
                else if (Objects.equals(item, "Player 6")) { editPlayer = 6; }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
    }

    public void editScore(View view) {
        switch(view.getId()) {
            case R.id.minP1:
                score1 -= addScore;
                setPlayer();
                return;
            case R.id.minP2:
                score2 -= addScore;
                setPlayer();
                return;
            case R.id.minP3:
                score3 -= addScore;
                setPlayer();
                return;
            case R.id.minP4:
                score4 -= addScore;
                setPlayer();
                return;
            case R.id.minP5:
                score5 -= addScore;
                setPlayer();
                return;
            case R.id.minP6:
                score6 -= addScore;
                setPlayer();
                return;
            case R.id.addP1:
                score1 += addScore;
                setPlayer();
                return;
            case R.id.addP2:
                score2 += addScore;
                setPlayer();
                return;
            case R.id.addP3:
                score3 += addScore;
                setPlayer();
                return;
            case R.id.addP4:
                score4 += addScore;
                setPlayer();
                return;
            case R.id.addP5:
                score5 += addScore;
                setPlayer();
                return;
            case R.id.addP6:
                score6 += addScore;
                setPlayer();
                return;
            default:
        }

        setPlayer();
    }

    public void editName(View view) {
        EditText edit = (EditText)findViewById(R.id.editName);
        String content = edit.getText().toString();

        if (Objects.equals(content, ""))
            return;

        switch(editPlayer) {
            case 1:
                name1 = content;
                break;
            case 2:
                name2 = content;
                break;
            case 3:
                name3 = content;
                break;
            case 4:
                name4 = content;
                break;
            case 5:
                name5 = content;
                break;
            case 6:
                name6 = content;
                break;
        }

        setPlayer();
    }

    public void resetNames(View view) {
        name1 = "Player";
        name2 = "Player";
        name3 = "Player";
        name4 = "Player";
        name5 = "Player";
        name6 = "Player";

        setPlayer();
    }

    public void resetScores(View view) {
        score1 = 0;
        score2 = 0;
        score3 = 0;
        score4 = 0;
        score5 = 0;
        score6 = 0;

        setPlayer();
    }
}
