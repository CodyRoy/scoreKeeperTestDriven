package com.example.cr554.scorekeepertestdriven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView teamOneDisplay = (TextView) findViewById(R.id.team_one_display);
        TextView teamTwoDisplay = (TextView) findViewById(R.id.team_two_display);
        Team teamOne = new Team(0,teamOneDisplay);
        Team teamTwo = new Team(0,teamTwoDisplay);
    }
}