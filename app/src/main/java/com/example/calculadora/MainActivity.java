package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText val1, val2;
    TextView res;
    Button Suma,Resta,Mult,Divi;
    Button Salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val1 = (EditText) findViewById(R.id.valor1);
        val2 = (EditText) findViewById(R.id.valor2);
        res = (TextView) findViewById(R.id.result);
        Suma = (Button) findViewById(R.id.calculo);
        Resta = (Button) findViewById(R.id.button);
        Mult = (Button) findViewById(R.id.button3);
        Divi = (Button) findViewById(R.id.button2);
        Salir = (Button) findViewById(R.id.salir);

        Suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suma();
            }
        });
        Resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resta();
            }
        });
        Mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multiplicacion();
            }
        });
        Divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                divi();
            }
        });
        Salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salir();
            }
        });
    }

    private void multiplicacion(){
        double x,y;
        double r;
        x=Integer.parseInt(val1.getText().toString());
        y=Integer.parseInt(val2.getText().toString());
        r=x*y;
        res.setText(String.valueOf(r));

    }

    private void divi(){
        double x,y;
        double r;
        x=Integer.parseInt(val1.getText().toString());
        y=Integer.parseInt(val2.getText().toString());
        r=x/y;
        res.setText(String.valueOf(r));

    }
    private void resta(){
        double x,y;
        double r;
        x=Integer.parseInt(val1.getText().toString());
        y=Integer.parseInt(val2.getText().toString());
        r=x-y;
        res.setText(String.valueOf(r));

    }
    private void suma(){
        double x,y;
        double r;
        x=Integer.parseInt(val1.getText().toString());
        y=Integer.parseInt(val2.getText().toString());
        r=x+y;
        res.setText(String.valueOf(r));

    }
    private void salir(){
      finish();
    }
}