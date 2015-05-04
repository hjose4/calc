package com.example.hani.calc;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    private Button c;
    private Button plus;
    private Button minus;
    private Button multi;
    private Button divide;
    private Button decimal;
    private Button equal;
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;


    private TextView display;

    double a,b,result=0.0 ;
    String option ="";
    boolean reset,first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c = (Button) findViewById(R.id.c);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multi = (Button) findViewById(R.id.multi);
        divide = (Button) findViewById(R.id.divide);
        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        decimal = (Button) findViewById(R.id.decimal);
        equal = (Button) findViewById(R.id.equal);
        display = (TextView) findViewById(R.id.display);


        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("0");
                a=b=result=0.0;
                option="";
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(zero);
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                disp(decimal);
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                disp(one);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                disp(two);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                disp(three);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                disp(four);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                disp(five);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                disp(six);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                disp(seven);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                disp(eight);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                disp(nine);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a = Double.parseDouble((String) display.getText());
                calculate(option,a);
                display.setText(""+result);
                reset = true;
                option= "add";

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                a = Double.parseDouble((String) display.getText());
                calculate(option,a);
                display.setText(""+result);
                reset = true;
                option= "minus";
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                a = Double.parseDouble((String) display.getText());
                calculate(option,a);
                display.setText(""+result);
                reset = true;
                option= "multi";
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a = Double.parseDouble((String) display.getText());
                calculate(option,a);
                display.setText(""+result);
                reset = true;
                option= "divide";
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                b = Double.parseDouble((String) display.getText());
                calculate(option, b);
                display.setText(""+result);
                reset = true;
            }
        });

    }
    public void disp(Button button){
        String number;
        number= (String)button.getText();
        if (!reset&&(display.getText().toString()).contains("."))
        {
            if(button.getText().toString().equals("."))
                display.setText(display.getText());
            else
                display.setText(display.getText()+number);
        }
       else if ((button.getText().toString()).equals("."))
        {
            if(reset) {
                display.setText("0"+number);
                reset = false;
            }
            else if(display.getText()=="0") {
                System.out.println("dot------------" + display.getText());
                display.setText("0" + number);
            }

                else
                    display.setText(display.getText() + number);
            System.out.println("0-------------"+display.getText());
            }

                //System.out.println((String)display.getText());
        else if (display.getText()=="0"||Double.parseDouble((String)display.getText())==0)
        {
            display.setText(number);
            first=true;
            System.out.println("1----------"+display.getText());
        }
        else
        {
            if(reset)
            {
                display.setText(number);
                reset= false;
                System.out.println("2----t-------"+display.getText());
            }
            else
            {
                display.setText(display.getText() + number);
                System.out.println("2-----f------" + display.getText());
            }
        }
    }


    public void calculate(String option,double b)
    {
        switch(option) {
            case "add":
                result += b;
                break;
            case "minus":
                result -= b;
                break;
            case "multi":
                result =result* b;
                break;
            case "divide":
                result = result/b;
                break;
            default:
                result= b;
                first= false;
                break;

        }
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
        if(id == R.id.scientific) {
            Intent intent = new Intent(MainActivity.this, MainActivity_Scientific.class);
            intent.putExtra("value", display.getText().toString());
            startActivityForResult(intent, 1);
        }
        return true;

    }
}
