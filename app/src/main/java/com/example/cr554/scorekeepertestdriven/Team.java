package com.example.cr554.scorekeepertestdriven;

import android.widget.TextView;

/**
 * Created by cr554 on 3/7/2017.
 */

public class Team {
    private int mScore;
    private TextView mScoreDisplay;

    //non-empty constructor creates dependency injection
    public Team(int score, TextView scoreDisplay){
        mScore= score;
        mScoreDisplay=scoreDisplay;
    }

    //class method to ++ score
    public void incrementScore(){
        mScore++;
    }

    //class method to -- score;
    public void decrementScore(){
        mScore--;
    }

    //class method to update the display.
    public void updateDisplay(){
        String scoreAsString = Integer.toString(mScore);
        mScoreDisplay.setText(scoreAsString);

    }

    //getters
    public TextView getmScoreDisplay() {
        return mScoreDisplay;
    }
    public int getmScore() {
        return mScore;
    }



}
