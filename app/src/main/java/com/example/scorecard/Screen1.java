package com.example.scorecard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Vector;


public class Screen1 extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b6;
    Button b0;
    Button bWide;
    Button bOut;
    Button bNoBall;
    TextView sc;
    TextView wk;
    TextView ov;
    TextView bl;
    TextView txtBat1,txtBat2,txtBat1runs,txtBat2runs,txtBat1balls,txtBat2balls;
    Vector<String> op2 = new Vector<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);
        b1=(Button)findViewById(R.id.ONE);
        b2=(Button)findViewById(R.id.TWO);
        b3=(Button)findViewById(R.id.THREE);
        b4=(Button)findViewById(R.id.FOUR);
        b6=(Button)findViewById(R.id.SIX);
        b0=(Button)findViewById(R.id.DOT);
        bWide=(Button)findViewById(R.id.WIDE);
        bOut=(Button)findViewById(R.id.WICKET);
        bNoBall=(Button)findViewById(R.id.NO_BALL);
        sc=(TextView)findViewById(R.id.txtRuns);
        wk=(TextView) findViewById(R.id.txtWickets);
        ov=(TextView) findViewById(R.id.txtOver);
        bl=(TextView) findViewById(R.id.txtBall);
        txtBat1=(TextView)findViewById(R.id.txtbat1);
        txtBat2=(TextView)findViewById(R.id.txtbat2);
        txtBat1runs=(TextView)findViewById(R.id.txtbat1runs);
        txtBat2runs=(TextView)findViewById(R.id.txtbat2runs);
        txtBat1balls=(TextView)findViewById(R.id.txtbat1balls);
        txtBat2balls=(TextView)findViewById(R.id.txtbat2balls);
        final batsman bat1 = new batsman();
        final batsman bat2 = new batsman();
        final data d1 = (data)getApplicationContext();
        op2=d1.getOp();
        bat1.setBatZero(op2.get(0),true);
        bat2.setBatZero(op2.get(1),false);
        show(d1,bat1,bat2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1.setScore(d1.getScore()+1);
                if(bat1.isOnStrike()){
                    bat1.setRuns(bat1.getRuns()+1);
                    bat1.setBalls(bat1.getBalls()+1);
                    changeStrike(bat1,bat2);
                }
                else {
                    bat2.setRuns(bat2.getRuns()+1);
                    bat2.setBalls(bat2.getBalls()+1);
                    changeStrike(bat1,bat2);
                }
                incBall(d1,bat1,bat2);
                show(d1,bat1,bat2);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1.setScore(d1.getScore()+2);
                if(bat1.isOnStrike()){
                    bat1.setRuns(bat1.getRuns()+2);
                    bat1.setBalls(bat1.getBalls()+1);
                }
                else {
                    bat2.setRuns(bat2.getRuns()+2);
                    bat2.setBalls(bat2.getBalls()+1);
                }
                incBall(d1,bat1,bat2);
                show(d1,bat1,bat2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1.setScore(d1.getScore()+3);
                if(bat1.isOnStrike()){
                    bat1.setRuns(bat1.getRuns()+3);
                    bat1.setBalls(bat1.getBalls()+1);
                    changeStrike(bat1,bat2);
                }
                else {
                    bat2.setRuns(bat2.getRuns()+3);
                    bat2.setBalls(bat2.getBalls()+1);
                    changeStrike(bat1,bat2);
                }
                incBall(d1,bat1,bat2);
                show(d1,bat1,bat2);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1.setScore(d1.getScore()+4);
                if(bat1.isOnStrike()){
                    bat1.setRuns(bat1.getRuns()+4);
                    bat1.setBalls(bat1.getBalls()+1);
                }
                else {
                    bat2.setRuns(bat2.getRuns()+4);
                    bat2.setBalls(bat2.getBalls()+1);
                }
                incBall(d1,bat1,bat2);
                show(d1,bat1,bat2);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1.setScore(d1.getScore()+6);
                if(bat1.isOnStrike()){
                    bat1.setRuns(bat1.getRuns()+6);
                    bat1.setBalls(bat1.getBalls()+1);
                }
                else {
                    bat2.setRuns(bat2.getRuns()+6);
                    bat2.setBalls(bat2.getBalls()+1);
                }
                incBall(d1,bat1,bat2);
                show(d1,bat1,bat2);
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bat1.isOnStrike()){
                    bat1.setBalls(bat1.getBalls()+1);
                }
                else {
                    bat2.setBalls(bat2.getBalls()+1);
                }
                incBall(d1,bat1,bat2);
                show(d1,bat1,bat2);
            }
        });
        bWide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1.setExtras(d1.getExtras()+1);
                show(d1,bat1,bat2);
            }
        });
        bOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1.setWickets(d1.getWickets()+1);
                Context c = Screen1.this;
                final Dialog d3 = new Dialog(c);
                d3.setContentView(R.layout.out);
                Button b1=(Button)findViewById(R.id.bowled);
                Button b2=(Button)findViewById(R.id.lbw);
                Button b3=(Button)findViewById(R.id.caught);
                Button b4=(Button)findViewById(R.id.stumped);
                Button b5=(Button)findViewById(R.id.runout);
                Button b6=(Button)findViewById(R.id.hitout);
                d3.show();
                incBall(d1,bat1,bat2);
                show(d1,bat1,bat2);
            }
        });
        bNoBall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1.setExtras(d1.getExtras()+1);
                show(d1,bat1,bat2);
            }
        });
    }

    void incBall(data d1,batsman b1,batsman b2){
        //Ball increment logic
        int b = d1.getBall();
        if(b<5){
            b=b+1;
            d1.setBall(b);
        }
        else{
            d1.setBall(0);
            d1.setOver(d1.getOver()+1);
            changeStrike(b1, b2);
        }
    }
    void show (data d1,batsman b1,batsman b2){
        //TextView can only display strings
        sc.setText(String.valueOf(d1.getScore()));
        wk.setText(String.valueOf(d1.getWickets()));
        ov.setText(String.valueOf(d1.getOver()));
        bl.setText(String.valueOf(d1.getBall()));
        if(b1.isOnStrike()){
            txtBat1.setText(b1.getName()+' '+'*');
            txtBat2.setText(b2.getName());
        }
        else{
            txtBat1.setText(b1.getName());
            txtBat2.setText(b2.getName()+' '+'*');
        }
        txtBat1runs.setText(String.valueOf(b1.getRuns()));
        txtBat2runs.setText(String.valueOf(b2.getRuns()));
        txtBat1balls.setText('('+String.valueOf(b1.getBalls())+')');
        txtBat2balls.setText(String.valueOf(b2.getBalls()));
    }
    void changeStrike(batsman b1,batsman b2){
        b1.setOnStrike(!(b1.isOnStrike()));
        b2.setOnStrike(!(b2.isOnStrike()));
    }


}