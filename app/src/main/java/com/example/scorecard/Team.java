package com.example.scorecard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Vector;

public class Team extends AppCompatActivity {

    EditText e1;
    EditText e2;
    EditText e3;
    EditText e4;
    EditText e5;
    EditText e6;
    Button b1;
    Button Confirm;
    Button b3;
    Button b4;
    Button b5;
    Vector<String> v1 = new Vector<>();
    Vector<String> v2 = new Vector<>();
    Vector<String> op1 = new Vector<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        e1=(EditText)findViewById(R.id.txtOvers);
        e2=(EditText)findViewById(R.id.txtPlayerNo);
        e3=(EditText)findViewById(R.id.team1Player);
        e4=(EditText)findViewById(R.id.team2Player);
        e5=(EditText)findViewById(R.id.txtopener1);
        e6=(EditText)findViewById(R.id.txtopener2);
        b1=(Button)findViewById(R.id.btnSelect1);
        b3=(Button)findViewById(R.id.btnSelect2);
        b4=(Button)findViewById(R.id.btnopener1);
        b5=(Button)findViewById(R.id.btnopener2);
        Confirm=(Button)findViewById(R.id.button4);
        final data d1 =(data)getApplicationContext();


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t = e3.getText().toString();
                if (t.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "...Please choose a Player...", Toast.LENGTH_LONG).show();
                } else {
                    v1.add(t);
                }

                e3.setText("");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t1 = e4.getText().toString();
                if(t1.isEmpty()){
                    Toast.makeText(getApplicationContext(),"...Please choose a Player...",Toast.LENGTH_LONG).show();
                }
                else {
                    v2.add(t1);
                }
                e4.setText("");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t = e5.getText().toString();
                op1.add(t);
                Toast.makeText(getApplicationContext(),"Player Selected",Toast.LENGTH_SHORT).show();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t1 = e6.getText().toString();
                op1.add(t1);
                Toast.makeText(getApplicationContext(),"Player Selected",Toast.LENGTH_SHORT).show();
            }
        });
        Confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int k = Integer.parseInt(e1.getText().toString());
                d1.setNoOfOvers(k);
                k = Integer.parseInt(e2.getText().toString());
                d1.setNoOfPlayers(k);
                d1.setT1(v1);
                d1.setT2(v2);
                d1.setOp(op1);


                openActivity3();
            }
        });




    }
    public void openActivity3(){
        Intent i = new Intent(this, Screen1.class);
        startActivity(i);
    }


}