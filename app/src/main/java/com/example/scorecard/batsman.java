package com.example.scorecard;
import android.app.Application;

public class batsman extends data {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;
    public int runs;
    public int balls;
    public boolean onStrike;
    public double strikeRate;

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public boolean isOnStrike() {
        return onStrike;
    }

    public void setOnStrike(boolean onStrike) {
        this.onStrike = onStrike;
    }

    public double getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(double strikeRate) {
        this.strikeRate = strikeRate;
    }
    public void setBatZero(String n,boolean ons){
        name = n;
        runs=0;
        balls=0;
        strikeRate=0;
        onStrike = ons;
    }

}
