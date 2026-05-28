package com.example.demo.model;

public class Score {

    private int runs = 0;
    private int wickets = 0;
    private int overs = 0;
    private int balls = 0;

    public int getRuns() {
        return runs;
    }

    public int getWickets() {
        return wickets;
    }

    public String getOvers() {
        return overs + "." + balls;
    }

    public void addRuns(int run) {

        runs += run;

        updateBall();
    }

    public void addWicket() {

        wickets++;

        updateBall();
    }

    private void updateBall() {

        balls++;

        if(balls == 6) {

            overs++;
            balls = 0;
        }
    }
}