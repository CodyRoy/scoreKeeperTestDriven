package com.example.cr554.scorekeepertestdriven;

import android.widget.TextView;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by cr554 on 3/7/2017.
 * feels wrong. should my methods take a param even if its a member var?
 */
public class TeamUnitTest {

    TextView textView;
    private Team team = new Team(0, textView);

    @Test
    public void incrementScoreTest() throws Exception {
        team.incrementScore();
        Assert.assertEquals(1, team.getmScore());
    }

    @Test
    public void decrementScoreTest() throws Exception {
        team.decrementScore();
        Assert.assertEquals(-1, team.getmScore());
    }
}