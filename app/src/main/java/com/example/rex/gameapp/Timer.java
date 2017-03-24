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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer);

        numSeconds = 30;
    }

    /**
     *  function will start timer on click
     * @param view
     */
    public void startTimer(View view) {
        if (isRunning)
            resetTimer();

        int time = numSeconds;
        time = time * 1000;

        timer = new CountDownTimer(time, 1000) {

            TextView textView = (TextView) findViewById(R.id.textView);
            public void onTick(long millisUntilFinished) {
                textView.setText(convertTime((int)(millisUntilFinished / 1000)));

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

    public void resetTimer(View view) {
        timer.cancel();
    }

    /**
     * user can add time to timer
     * @param view
     */
    public void addSecond(View view) {
        numSeconds++;

        String time = convertTime(numSeconds);

        displayDemo(time);
    }
    public void addTenSeconds(View view) {
        numSeconds = numSeconds + 10;

        String time = convertTime(numSeconds);

        displayDemo(time);
    }
    public void addMinute(View view) {
        numSeconds = numSeconds + 60;

        String time = convertTime(numSeconds);

        displayDemo(time);
    }
    public void addTenMinutes(View view) {
        numSeconds = numSeconds + 600;

        String time = convertTime(numSeconds);

        displayDemo(time);
    }

    /**
     * user can remove time to timer
     * @param view
     */
    public void removeSecond(View view) {
        numSeconds--;
        if (numSeconds < 1)
            numSeconds = 1;

        String time = convertTime(numSeconds);

        displayDemo(time);
    }

    public void removeTenSeconds(View view) {
        numSeconds -= 10;
        if (numSeconds < 1)
            numSeconds = 1;

        String time = convertTime(numSeconds);

        displayDemo(time);
    }

    public void removeMinute(View view) {
        numSeconds -= 60;
        if (numSeconds < 1)
            numSeconds = 1;

        String time = convertTime(numSeconds);

        displayDemo(time);
    }

    public void removeTenMinutes(View view) {
        numSeconds -= 600;
        if (numSeconds < 1)
            numSeconds = 1;

        String time = convertTime(numSeconds);

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

}