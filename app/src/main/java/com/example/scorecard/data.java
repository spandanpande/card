package com.example.scorecard;
import android.app.Application;

import java.util.Vector;

public class data extends Application{

    public int Score;
    public int Wickets;
    public int extras;
    public int NoOfOvers;
    public int Over;
    public int Ball;

    public Vector<String> getOp() {
        return op;
    }

    public void setOp(Vector<String> op) {
        this.op = op;
    }

    public Vector<String> op;



    public Vector<String> getT1() {
        return t1;
    }

    public void setT1(Vector<String> t1) {
        this.t1 = t1;
    }

    public Vector<String> getT2() {
        return t2;
    }

    public void setT2(Vector<String> t2) {
        this.t2 = t2;
    }

    public Vector<String> t1;
    public Vector<String> t2;

    public int getNoOfPlayers() {
        return NoOfPlayers;
    }

    public void setNoOfPlayers(int noOfPlayers) {
        NoOfPlayers = noOfPlayers;
    }

    public int NoOfPlayers;
    public int getNoOfOvers() {
        return NoOfOvers;
    }

    public void setNoOfOvers(int noOfOvers) {
        NoOfOvers = noOfOvers;
    }

    public int getExtras() {
        return extras;
    }

    public void setExtras(int extras) {
        this.extras = extras;
    }



    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public int getWickets() {
        return Wickets;
    }

    public void setWickets(int wickets) {
        Wickets = wickets;
    }



    public int getOver() {
        return Over;
    }

    public void setOver(int over) {
        this.Over = over;
    }

    public int getBall() {
        return Ball;
    }

    public void setBall(int ball) {
        this.Ball = ball;
    }
}
