package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnFactorial;
    private Button btnLimpiar;
    private EditText resultadoET;
    private Button btnCero;
    private Button btnUno;
    private Button btnDos;
    private Button btnTres;
    private Button btnCuatro;
    private Button btnCinco;
    private Button btnSeis;
    private Button btnSiete;
    private Button btnOcho;
    private Button btnNueve;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultadoET = (EditText)findViewById(R.id.editText);

        btnCero = (Button)findViewById(R.id.btnZero);
        btnUno = (Button)findViewById(R.id.btnOne);
        btnDos = (Button)findViewById(R.id.btnTwo);
        btnTres = (Button)findViewById(R.id.btnThree);
        btnCuatro = (Button)findViewById(R.id.btnFour);
        btnCinco = (Button)findViewById(R.id.btnFive);
        btnSeis = (Button)findViewById(R.id.btnSix);
        btnSiete = (Button)findViewById(R.id.btnSeven);
        btnOcho = (Button)findViewById(R.id.btnEight);
        btnNueve = (Button)findViewById(R.id.btnNine);
        btnLimpiar = (Button)findViewById(R.id.btnClear);
        btnFactorial = (Button)findViewById(R.id.btnOperacion);
        resultadoET.setInputType(InputType.TYPE_NULL);



        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultadoET.append("0");
                resultadoET.setSelection(resultadoET.length());
            }
        });
        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultadoET.append("1");
                resultadoET.setSelection(resultadoET.length());
            }
        });
        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultadoET.append("2");
                resultadoET.setSelection(resultadoET.length());
            }
        });
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultadoET.append("3");
                resultadoET.setSelection(resultadoET.length());
            }
        });
        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultadoET.append("4");
                resultadoET.setSelection(resultadoET.length());
            }
        });
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultadoET.append("5");
                resultadoET.setSelection(resultadoET.length());
            }
        });
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultadoET.append("6");
                resultadoET.setSelection(resultadoET.length());
            }
        });
        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultadoET.append("7");
                resultadoET.setSelection(resultadoET.length());
            }
        });
        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultadoET.append("8");
                resultadoET.setSelection(resultadoET.length());
            }
        });
        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultadoET.append("9");
                resultadoET.setSelection(resultadoET.length());
            }
        });
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultadoET.setText("");
                resultadoET.setSelection(resultadoET.length());
            }
        });
        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if(resultadoET.getText().toString().length() == 0 || resultadoET.getText().toString() == ""){
                        resultadoET.setText("");
                        resultadoET.setText("Error");
                    }else{
                        int res = factorialResul(Integer.parseInt(resultadoET.getText().toString()));
                        resultadoET.setText("");
                        resultadoET.setText(""+res);
                        resultadoET.setSelection(resultadoET.length());
                    }
                }catch (Error e){
                    resultadoET.setText("");
                    resultadoET.setText(""+e);
                }
                //System.out.println(resultadoET.length());

            }
        });
    }

    int factorialResul(int a){
        int res = 1;
        if(a!=0){
            for(int i = a; i!=0; --i){
                res *= i;
            }
        }


        return res;
    }

}
