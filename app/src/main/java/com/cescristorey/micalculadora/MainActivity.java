package com.cescristorey.micalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double subtotal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tecla C
        Button b5 = (Button) findViewById(R.id.Button05);
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                tv2.setText("");
            }

        });
        //Listeners de los botones num�ricos
        Button b2 = (Button) findViewById(R.id.Button02);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                tv2.setText(tv2.getText() + "7");
            }

        });
        Button b6 = (Button) findViewById(R.id.Button06);
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                tv2.setText(tv2.getText() + "8");
            }

        });
        Button b7 = (Button) findViewById(R.id.Button07);
        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                tv2.setText(tv2.getText() + "9");
            }

        });
        Button b10 = (Button) findViewById(R.id.Button10);
        b10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                tv2.setText(tv2.getText() + "4");
            }

        });
        Button b11 = (Button) findViewById(R.id.Button11);
        b11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                tv2.setText(tv2.getText() + "5");
            }

        });
        Button b12 = (Button) findViewById(R.id.Button12);
        b12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                tv2.setText(tv2.getText() + "6");
            }

        });
        Button b14 = (Button) findViewById(R.id.Button14);
        b14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                tv2.setText(tv2.getText() + "1");
            }

        });
        Button b15 = (Button) findViewById(R.id.Button15);
        b15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                tv2.setText(tv2.getText() + "2");
            }

        });
        Button b16 = (Button) findViewById(R.id.Button16);
        b16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                tv2.setText(tv2.getText() + "3");
            }

        });
        Button b17 = (Button) findViewById(R.id.Button17);
        b17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                tv2.setText(tv2.getText() + "0");
            }

        });
        Button b18 = (Button) findViewById(R.id.Button18);
        b18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                tv2.setText(tv2.getText() + ".");
            }

        });
        //Suma
        Button b09 = (Button) findViewById(R.id.Button09);
        b09.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                subtotal = Double.valueOf((String) tv2.getText()).doubleValue();
                tv2.setText("");
                TextView tv1 = (TextView) findViewById(R.id.textView1);
                tv1.setText("+");
            }

        });
        //Resta
        Button b08 = (Button) findViewById(R.id.Button08);
        b08.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                subtotal = Double.valueOf((String) tv2.getText()).doubleValue();
                tv2.setText("");
                TextView tv1 = (TextView) findViewById(R.id.textView1);
                tv1.setText("-");
            }

        });
        //Multiplicacion
        Button b01 = (Button) findViewById(R.id.Button01);
        b01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                subtotal = Double.valueOf((String) tv2.getText()).doubleValue();
                tv2.setText("");
                TextView tv1 = (TextView) findViewById(R.id.textView1);
                tv1.setText("X");
            }

        });
        //Divisi�n
        Button b04 = (Button) findViewById(R.id.Button04);
        b04.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                subtotal = Double.valueOf((String) tv2.getText()).doubleValue();
                tv2.setText("");
                TextView tv1 = (TextView) findViewById(R.id.textView1);
                tv1.setText("/");
            }

        });
        //Si pulsa =
        Button b13 = (Button) findViewById(R.id.Button13);
        b13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                double numero = Double.valueOf((String) tv2.getText()).doubleValue();
                TextView tv1 = (TextView) findViewById(R.id.textView1);
                String operacion = tv1.getText().toString();
                if (operacion != "") {
                    if (operacion == "+")
                        subtotal = numero + subtotal;
                    else if (operacion == "-")
                        subtotal = subtotal - numero;
                    else if (operacion == "X")
                        subtotal = subtotal * numero;
                    else if (operacion == "/")
                        subtotal = subtotal / numero;
                    String resultado = String.valueOf(subtotal);
                    int longitud = resultado.length();

                    //Si acaba en .0 muestro como entero
                    if ((resultado.charAt(longitud - 2) == '.') && (resultado.charAt(longitud - 1) == '0'))
                        resultado = resultado.substring(0, resultado.length() - 2);
                    tv2.setText(resultado);
                    tv1.setText("");
                }
            }

        });
        // Si pulsa C
        Button b05 = (Button) findViewById(R.id.Button05);
        b05.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                subtotal = 0;
                tv2.setText("");
                TextView tv1 = (TextView) findViewById(R.id.textView1);
                tv1.setText("");
            }

        });
        // +/-
        Button b03 = (Button) findViewById(R.id.Button03);
        b03.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView tv2 = (TextView) findViewById(R.id.textView2);
                if (tv2.getText().charAt(0) == '-')
                    tv2.setText(tv2.getText().subSequence(1, tv2.getText().length() - 1));

                else
                    tv2.setText("-" + tv2.getText().toString());

            }
        });
    }
}
