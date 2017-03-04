package com.example.rex.gameapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Player extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
    }

    public void addPLayer(View view) {
        EditText nameInput = (EditText) findViewById(R.id.new_player_name);
        String name = nameInput.getText().toString();

    }

    public void removePlayer(View view) {

    }

    public void resetPlayer(View view) {

    }

}
