package com.example.rex.gameapp;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;


public class Timer extends AppCompatActivity {
    private int numSeconds;
    private boolean isRunning = false;
    CountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer);

        numSeconds = 30;
    }

    public void startTimer(View view) {
        if (isRunning)
            resetTimer();

        int time = numSeconds;
        time = time * 1000;

        timer = new CountDownTimer(time, 1000) {

            TextView textView = (TextView) findViewById(R.id.textView);
            public void onTick(long millisUntilFinished) {
                textView.setText("" + millisUntilFinished / 1000);

                isRunning = true;
            }

            public void onFinish() {
                textView.setText("Time's up!");

                isRunning = false;
            }
        }.start();
    }

    private void resetTimer() {
        timer.cancel();
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