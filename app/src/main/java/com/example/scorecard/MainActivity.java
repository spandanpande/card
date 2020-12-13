package com.example.scorecard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    TextView t1;
    float f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.btnToss);
        b2=(Button)findViewById(R.id.btnStart);
        t1=(TextView)findViewById(R.id.txtToss);
        data d1 = (data)getApplicationContext();
        d1.setScore(0);
        d1.setWickets(0);
        d1.setExtras(0);
        d1.setOver(0);
        d1.setBall(0);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                f = r.nextFloat();
                if(f<0.5){
                    t1.setText("Heads");
                }
                else {
                    t1.setText("Tails");
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
    }

    public void openActivity1(){
        Intent i = new Intent(this, Team.class);
        startActivity(i);
    }
}