package com.example.meu1projeto;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText valor1;
    EditText valor2;
    Button botaoSoma;
    Button botaoSub;
    Button botaoMulti;
    Button botaoDiv;
    TextView valorSaida;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);
        botaoSoma = findViewById(R.id.botaoSoma);
        botaoSub = findViewById(R.id.botaoSub);
        botaoMulti = findViewById(R.id.botaoMulti);
        botaoDiv = findViewById(R.id.botaoDiv);
        valorSaida = findViewById(R.id.valorSaida);

        botaoSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num1 = Integer.parseInt(valor1.getText().toString());
                int num2 = Integer.parseInt(valor2.getText().toString());
                int resultado = num1 + num2;
                valorSaida.setText("resultado: " + resultado);


            }
        });




    }
}