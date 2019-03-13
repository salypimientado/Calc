package com.example.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    float num1 =0;
    float num2 =0;
    float result =0;

    Button but1;
    Button but2;
    Button but3;
    Button but4;
    Button but5;
    Button but6;
    Button but7;
    Button but8;
    Button but9;
    Button but0;
    Button butplus;
    Button butminus;
    Button butmult;
    Button butdiv;
    Button butequals;
    Button butcos;
    Button butsin;
    Button butac;
    Button butpoint;
    Button butpower;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
setup();



    }


    void setup(){

        but1 = findViewById(R.id.one);
        but2 = findViewById(R.id.button2);
        but3 = findViewById(R.id.button3);
        butdiv = findViewById(R.id.button4);
        but4 = findViewById(R.id.button9);
        but5 = findViewById(R.id.button10);
        but6 = findViewById(R.id.button11);
        but7 = findViewById(R.id.button13);
        but8 = findViewById(R.id.button15);
        but9 = findViewById(R.id.button16);
        but0 = findViewById(R.id.button18);
        butminus = findViewById(R.id.button14);
        butac = findViewById(R.id.button5);
        butmult = findViewById(R.id.button12);
        butdiv = findViewById(R.id.button4);
        butequals = findViewById(R.id.button19);
        butcos = findViewById(R.id.button7);
        butsin = findViewById(R.id.button8);
        butpower = findViewById(R.id.button6);
        butpoint = findViewById(R.id.button17);

    }
}
