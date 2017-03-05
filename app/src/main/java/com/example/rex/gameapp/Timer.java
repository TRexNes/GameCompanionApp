package com.example.rex.gameapp;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class Timer extends AppCompatActivity {
    private int numSeconds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer);

        numSeconds = 30;
    }

    public void startTimer() {
        int time = numSeconds;
        time = time * 1000;

        new CountDownTimer(time, 1000) {

            TextView textView = (TextView) findViewById(R.id.textView);
            public void onTick(long millisUntilFinished) {
                textView.setText("" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                textView.setText("Time's up!");
            }
        }.start();
    }

    public void addTime(View view) {
        numSeconds++;

        TextView textView = (TextView) findViewById(R.id.timeSelect);
        textView.setText("" + numSeconds);
    }

    public void removeTime(View view) {
        numSeconds--;
        if (numSeconds < 1)
            numSeconds = 1;

        TextView textView = (TextView) findViewById(R.id.timeSelect);
        textView.setText("" + numSeconds);
    }
}