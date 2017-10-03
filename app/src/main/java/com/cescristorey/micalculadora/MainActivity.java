package com.cescristorey.micalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double subtotal = 0;
    Button boton7, boton8, boton9, boton4, boton5, boton6, boton1, boton2, boton3, boton0, botonPunto, botonSuma, botonResta, botonMultiplicacion, botonDivision, botonIgual, botonC, botonMasMenos;
    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asocio los textview
        tv2 = (TextView) findViewById(R.id.textView2);
        tv1 = (TextView) findViewById(R.id.textView1);


        //Botones numéricos
        boton7 = (Button) findViewById(R.id.Button02);
        boton7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv2.setText(tv2.getText() + "7");
            }

        });

        boton8 = (Button) findViewById(R.id.Button06);
        boton8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv2.setText(tv2.getText() + "8");
            }

        });

        boton9 = (Button) findViewById(R.id.Button07);
        boton9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv2.setText(tv2.getText() + "9");
            }

        });

        boton4 = (Button) findViewById(R.id.Button10);
        boton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv2.setText(tv2.getText() + "4");
            }

        });

        boton5 = (Button) findViewById(R.id.Button11);
        boton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv2.setText(tv2.getText() + "5");
            }

        });

        boton6 = (Button) findViewById(R.id.Button12);
        boton6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv2.setText(tv2.getText() + "6");
            }

        });

        boton1 = (Button) findViewById(R.id.Button14);
        boton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv2.setText(tv2.getText() + "1");
            }

        });

        boton2 = (Button) findViewById(R.id.Button15);
        boton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv2.setText(tv2.getText() + "2");
            }

        });

        boton3 = (Button) findViewById(R.id.Button16);
        boton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv2.setText(tv2.getText() + "3");
            }

        });

        boton0 = (Button) findViewById(R.id.Button17);
        boton0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv2.setText(tv2.getText() + "0");
            }

        });

        botonPunto = (Button) findViewById(R.id.Button18);
        botonPunto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv2.setText(tv2.getText() + ".");
            }

        });

        //Suma
        botonSuma = (Button) findViewById(R.id.Button09);
        botonSuma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                subtotal = Double.valueOf((String) tv2.getText()).doubleValue();
                tv2.setText("");
                tv1.setText("+");
            }

        });

        //Resta
        botonResta = (Button) findViewById(R.id.Button08);
        botonResta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                subtotal = Double.valueOf((String) tv2.getText()).doubleValue();
                tv2.setText("");
                tv1.setText("-");
            }

        });

        //Multiplicacion
        botonMultiplicacion = (Button) findViewById(R.id.Button01);
        botonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                subtotal = Double.valueOf((String) tv2.getText()).doubleValue();
                tv2.setText("");
                tv1.setText("X");
            }

        });

        //División
        botonDivision = (Button) findViewById(R.id.Button04);
        botonDivision.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                subtotal = Double.valueOf((String) tv2.getText()).doubleValue();
                tv2.setText("");
                tv1.setText("/");
            }

        });

        //Si pulsa =
        botonIgual = (Button) findViewById(R.id.Button13);
        botonIgual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double numero = Double.valueOf((String) tv2.getText()).doubleValue();
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
        botonC = (Button) findViewById(R.id.Button05);
        botonC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                subtotal = 0;
                tv2.setText("");
                tv1.setText("");
            }

        });

        // +/-
        botonMasMenos = (Button) findViewById(R.id.Button03);
        botonMasMenos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (tv2.getText().charAt(0) == '-')
                    tv2.setText(tv2.getText().subSequence(1, tv2.getText().length() - 1));

                else
                    tv2.setText("-" + tv2.getText().toString());

            }
        });
    }
}
