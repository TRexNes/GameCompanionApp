package com.example.rex.gameapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // This is a test of the push.

    //Testing again

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openRollDice(View view) {
        Intent intent = new Intent(this, RollDice.class);

        startActivity(intent);
    }
}
