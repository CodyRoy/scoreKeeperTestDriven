package com.example.cr554.scorekeepertestdriven;

import android.widget.TextView;

/**
 * Created by cr554 on 3/7/2017.
 */

public class Team {
    private int score;
    private TextView scoreDisplay;

    public void incrementScore(){
        score++;
        updateDisplay();
    }

    public void decrementScore(){
        score--;
        updateDisplay();
    }

    public void updateDisplay(){
        TextView display = getScoreDisplay();

    }

    public TextView getScoreDisplay(){
        return scoreDisplay;
    }

    public void setScoreDisplay(TextView textView){
        scoreDisplay = textView;
    }

}
