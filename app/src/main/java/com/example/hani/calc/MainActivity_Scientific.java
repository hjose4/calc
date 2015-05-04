package com.example.hani.calc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.Math;


public class MainActivity_Scientific extends ActionBarActivity {
    private Button c;
    private Button sin;
    private Button cos;
    private Button tan;
    private Button i;
    private Button sqrt;
    private Button pi;
    private Button e;
    private Button pwr;
    private Button ln;
    private Button log;
    private Button percent;
    private Button fact;
//    private Button six;
//    private Button seven;
//    private Button eight;
//    private Button nine;

    private TextView display;

    double a,b,result=0.0 ;
    String option ="";
    boolean reset,first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c = (Button) findViewById(R.id.c);
        sin = (Button) findViewById(R.id.sin);
        cos = (Button) findViewById(R.id.cos);
        tan = (Button) findViewById(R.id.tan);
        fact = (Button) findViewById(R.id.fact);
        ln = (Button) findViewById(R.id.ln);
        log = (Button) findViewById(R.id.log);
        pwr = (Button) findViewById(R.id.pwr);
        sqrt = (Button) findViewById(R.id.sqrt);
        e = (Button) findViewById(R.id.e);
        i = (Button) findViewById(R.id.i);
        percent = (Button) findViewById(R.id.percent);
        pi = (Button) findViewById(R.id.pi);
//        eight = (Button) findViewById(R.id.eight);
//        nine = (Button) findViewById(R.id.nine);
//        decimal = (Button) findViewById(R.id.decimal);
//        equal = (Button) findViewById(R.id.equal);
        display = (TextView) findViewById(R.id.display);
        display.setText(getIntent().getStringExtra("value"));
        System.out.println("................."+display.getText());


        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("0");
                a=b=result=0.0;
                option="";
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a= Double.parseDouble(display.getText().toString());
                result= Math.sin(a);
                display.setText(""+result);

            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Double.parseDouble(display.getText().toString());
                result = Math.cos(a);
                display.setText(""+result);
            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= Double.parseDouble(display.getText().toString());
                result= Math.tan(a);
                display.setText(""+result);
            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= Double.parseDouble(display.getText().toString());
                result = 1/a;
                display.setText(""+result);
            }
        });

        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= Double.parseDouble(display.getText().toString());
                result = Math.log(a);
                display.setText(""+result);
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= Double.parseDouble(display.getText().toString());
                result = Math.log10(a);
                display.setText("" + result);
            }
        });

        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= Double.parseDouble(display.getText().toString());
                result = Math.sqrt(a);
                display.setText("" + result);
            }
        });

        pwr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= Double.parseDouble(display.getText().toString());
                result = Math.pow(a,2);
                display.setText("" + result);
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= Double.parseDouble(display.getText().toString());
                display.setText("" + result);
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= Double.parseDouble(display.getText().toString());
                result = Math.exp(a);
                display.setText("" + result);
            }
        });

        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= Double.parseDouble(display.getText().toString());
                if(a==0)
                    a=1;
                result= 3.14*a;
                display.setText("" + result);
            }
        });

        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a= Double.parseDouble(display.getText().toString());
                result = fact(a);
                display.setText(""+result);

            }
        });


    }
    protected double fact(double n)
    {
        if(n<=1)
            return n;
        else
            return n*fact(n - 1);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}