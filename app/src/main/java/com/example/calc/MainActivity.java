package com.example.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    float num1 =0;
    float num2 =0;
    float result =0;
    float op = 0;
    float dec = .1f;
    String num;
    float res1 = 0;
    float res2 = 0;
    int decNum = 1;
    boolean suma = false;
    boolean div = false;
    boolean mult = false;
    boolean resta = false;
    boolean sin = false;
    boolean cos = false;
    boolean point = false;

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

    EditText result1;
    EditText signo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
setup();



    }


    void setup(){

        result1 = findViewById(R.id.result);
        signo = findViewById(R.id.signo);
        but1 = findViewById(R.id.one);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one();
            }
        });
        but2 = findViewById(R.id.button2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                two();
            }
        });
        but3 = findViewById(R.id.button3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                three();
            }
        });
        butdiv = findViewById(R.id.button4);
        but4 = findViewById(R.id.button9);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            four();
            }
        });
        but5 = findViewById(R.id.button10);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
five();
            }
        });
        but6 = findViewById(R.id.button11);
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                six();
            }
        });
        but7 = findViewById(R.id.button13);
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
seven();
            }
        });
        but8 = findViewById(R.id.button15);
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acht();
            }
        });
        but9 = findViewById(R.id.button16);
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
neun();
            }
        });
        but0 = findViewById(R.id.button18);
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
zero();
            }
        });
        butminus = findViewById(R.id.button14);
        butminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                minus();
            }
        });
        butac = findViewById(R.id.button5);
        butac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AC();
            }
        });
        butmult = findViewById(R.id.button12);
        butmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multi();
            }
        });
        butdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                div();
            }
        });
        butequals = findViewById(R.id.button19);
        butequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Equals();
            }
        });
        butcos = findViewById(R.id.button7);
        butsin = findViewById(R.id.button8);
        butpower = findViewById(R.id.button6);
        butpoint = findViewById(R.id.button17);
        butpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                point();
            }
        });
        butplus = findViewById(R.id.button20);
        butplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plus();
            }
        });

    }

    public void one()
    {
        if(point == true)
        {
            op = (result*(10^decNum));
            op = op++;
            op = op/(10^decNum);
            op = op + dec;
            decNum++;
        }
        else {
            op = (result * 10) + 1;

        }
        result = op;
        num = Float.toString(op);
Log.d("num", "num");
        result1.setText(num);


    }

    public void two()
    {
        op = (result*10)+2;
        result = op;

        num = Float.toString(op);

        result1.setText(num);

    }

    public void three()
    {
        op = (result*10)+3;
        result = op;

        num = Float.toString(op);

        result1.setText(num);

    }

    public void four()
    {
        op = (result*10)+4;
        result = op;

        num = Float.toString(op);

        result1.setText(num);

    }

    public void five()
    {
        op = (result*10)+5;
        result = op;

        num = Float.toString(op);

        result1.setText(num);

    }

    public void six()
    {
        op = (result*10)+6;
        result = op;

        num = Float.toString(op);

        result1.setText(num);

    }

    public void seven()
    {
        op = (result*10)+7;
        result = op;

        num = Float.toString(op);

        result1.setText(num);

    }

    public void acht()
    {
        op = (result*10)+8;
        result = op;

        num = Float.toString(op);

        result1.setText(num);

    }

    public void neun()
    {
        op = (result*10)+9;
        result = op;

        num = Float.toString(op);

        result1.setText(num);

    }

    public void zero()
    {
        op = (result*10);
        result = op;

        num = Float.toString(op);

        result1.setText(num);

    }

    public void plus()
    {
        saveNum1();
        result =0;
        op = 0;
        suma = true;
        div = false;
        mult = false;
        resta = false;
        sin = false;
        cos = false;
        point = false;

        signo.setText("+");

    }

    public void minus()
    {
        saveNum1();
        result =0;
        op = 0;
        suma = false;
        div = false;
        mult = false;
        resta = true;
        sin = false;
        cos = false;
        point = false;

        signo.setText("-");

    }

    public void multi()
    {
        saveNum1();
        result =0;
        op = 0;
        suma = false;
        div = false;
        mult = true;
        resta = false;
        sin = false;
        cos = false;
        point = false;

        signo.setText("*");

    }

    public void div()
    {
        saveNum1();
        result =0;
        op = 0;
        suma = false;
        div = true;
        mult = false;
        resta = false;
        sin = false;
        cos = false;
        point = false;

        signo.setText("/");

    }

    public void saveNum1()
    {
        res1 = result;
    }
    public void point()
    {
        point = true;
    }

    public void AC()
    {
         num1 =0;
         num2 =0;
         result =0;
         op = 0;
         res1 = 0;
        res2 = 0;
        decNum = 1;
        suma = false;
        div = false;
        mult = false;
        resta = false;
        sin = false;
        cos = false;
        point = false;


        result1.setText("0");
        signo.setText("");
    }

    public void Equals()
    {
        if(suma == true)
        {
           result = res1 + result;

           num = Float.toString(result);

        }
        if(resta == true)
        {
            result = res1 - result;

            num = Float.toString(result);

        }
        if(div == true)
        {
            result = res1 / result;

            num = Float.toString(result);


        }
        if(mult == true)
        {
            result = res1 * result;

            num = Float.toString(result);


        }
        saveNum1();
        result1.setText(num);
        signo.setText("");
        result =0;
        op = 0;
        decNum = 1;
        suma = false;
        div = false;
        mult = false;
        resta = false;
        sin = false;
        cos = false;
        point = false;

    }

}
