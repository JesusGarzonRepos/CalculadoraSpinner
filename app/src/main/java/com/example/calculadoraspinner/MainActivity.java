package com.example.calculadoraspinner;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tvRes;
    private Spinner spOperaciones;
    private Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        et1 =(EditText)findViewById(R.id.editTextNumber1);
        et2 =(EditText)findViewById(R.id.editTextNumber2);
        tvRes =(TextView) findViewById(R.id.textView5);
            btnCalcular =(Button) findViewById(R.id.button2);
        spOperaciones =(Spinner) findViewById(R.id.spinner);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular();
            }

        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        }

       private void calcular(){
        int interValor1 = Integer.parseInt(et1.getText().toString());
        int interValor2 = Integer.parseInt(et2.getText().toString());
        String seleccionado = spOperaciones.getSelectedItem().toString();
        if (seleccionado.equals("sumar")){
            int suma = interValor1+ interValor2;
            tvRes.setText(String.valueOf(suma));
        }else if (seleccionado.equals("Restar")){

            tvRes.setText(String.valueOf(interValor1 - interValor2));
        }else if (seleccionado.equals("Multiplicar")) {

            tvRes.setText(String.valueOf(interValor1 * interValor2));
        }  else if (seleccionado.equals("Dividir")){

                tvRes.setText(String.valueOf(interValor1 - interValor2));
    }}
}