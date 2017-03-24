package com.example.rex.gameapp;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;


/**
 *
 *  Timer Activity
 *
 *  This activity will get the timer duration from the user
 *  and count down
 *
 * @ author  Adam Fletcher
 * @ author  Matthew Wilcox
 * @ author  Rex Nesbit
 *
 * @ Version 1.0
 */


public class Timer extends AppCompatActivity {
    private int numSeconds;
    private boolean isRunning = false;
    CountDownTimer timer;
    private int pauseTime;
    private int trueTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer);

        trueTime = 30;
        numSeconds = trueTime;
    }

    /**
     *  function will start timer on click
     * @param view
     */
    public void startTimer(View view) {
        if (isRunning)
            resetTimer();
        numSeconds = trueTime;

        setTimer(numSeconds);
    }

    public void setTimer(int t) {
        int time = t * 1000;

        timer = new CountDownTimer(time, 1000) {

            TextView textView = (TextView) findViewById(R.id.textView);
            public void onTick(long millisUntilFinished) {
                textView.setText(convertTime((int)(millisUntilFinished / 1000)));

                pauseTime = (int)millisUntilFinished / 1000;

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

        isRunning = false;
    }

    public void resetTimer(View view) {
        timer.cancel();

        isRunning = false;
    }

    /**
     * user can add time to timer
     * @param view
     */
    public void addSecond(View view) {
        trueTime++;

        numSeconds = trueTime;

        String time = convertTime(trueTime);

        displayDemo(time);
    }
    public void addTenSeconds(View view) {
        trueTime += 10;

        numSeconds = trueTime;

        String time = convertTime(trueTime);

        displayDemo(time);
    }
    public void addMinute(View view) {
        trueTime += 60;

        numSeconds = trueTime;

        String time = convertTime(trueTime);

        displayDemo(time);
    }
    public void addTenMinutes(View view) {
        trueTime +=  600;

        numSeconds = trueTime;

        String time = convertTime(trueTime);

        displayDemo(time);
    }

    /**
     * user can remove time to timer
     * @param view
     */
    public void removeSecond(View view) {
        trueTime--;
        if (trueTime < 1)
            trueTime = 1;

        numSeconds = trueTime;

        String time = convertTime(trueTime);

        displayDemo(time);
    }

    public void removeTenSeconds(View view) {
        trueTime -= 10;
        if (trueTime < 1)
            trueTime = 1;

        numSeconds = trueTime;

        String time = convertTime(trueTime);

        displayDemo(time);
    }

    public void removeMinute(View view) {
        trueTime -= 60;
        if (trueTime < 1)
            trueTime = 1;

        numSeconds = trueTime;

        String time = convertTime(trueTime);

        displayDemo(time);
    }

    public void removeTenMinutes(View view) {
        trueTime -= 600;
        if (trueTime < 1)
            trueTime = 1;

        numSeconds = trueTime;

        String time = convertTime(trueTime);

        displayDemo(time);
    }

    private void displayDemo(String time) {
        TextView textView = (TextView) findViewById(R.id.timeSelect);
        textView.setText(time);
    }

    public String convertTime(int numTime) {
        String time;
        int minutes1 = numTime / 60;
        if (minutes1 > 99)
            minutes1 = 99;

        String minutes2;
        if (minutes1 <= 9)
            minutes2 = "0" + minutes1;
        else
            minutes2 = "" + minutes1;

        int seconds1 = numTime % 60;

        String seconds2;
        if (seconds1 <= 9)
            seconds2 = "0" + seconds1;
        else
            seconds2 = "" + seconds1;

        time = minutes2 + ":" +seconds2;

        return time;
    }

    public void resumeTimer(View view) {
        if (!isRunning) {
            numSeconds = pauseTime;

            setTimer(pauseTime);
        }
    }
}