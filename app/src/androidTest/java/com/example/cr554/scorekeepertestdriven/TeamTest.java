package com.example.cr554.scorekeepertestdriven;


import android.support.test.annotation.UiThreadTest;
import android.support.test.rule.ActivityTestRule;
import android.widget.TextView;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;

/**
 * Created by cr554 on 3/7/2017.
 */

public class TeamTest {

    @Rule //runs before each of my tests. essentially says "before i run this test, make a new activity test rule of the mainactivity
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    @UiThreadTest //is needed to prevent a threading error
    public void updateDisplay() throws Exception {
        TextView textView = (TextView) mActivityRule.getActivity().findViewById(R.id.team_one_display);
        Team team = new Team(0, textView);

        team.updateDisplay();
        Assert.assertEquals("0", textView.getText());

    }

}