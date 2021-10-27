package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityDatos extends AppCompatActivity {

    TextView txtresultadoN,txtresultadoA,txtresultadoE,txtresultadoC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);


        txtresultadoN=findViewById(R.id.txtnom);
        txtresultadoA=findViewById(R.id.txtape);
        txtresultadoE=findViewById(R.id.txtEdad);
        txtresultadoC=findViewById(R.id.txtCorreo);

        Bundle recibedatos=getIntent().getExtras();
        String datosN=recibedatos.getString("keyDatosN");
        String datosA=recibedatos.getString("keyDatosA");
        String datosE=recibedatos.getString("keyDatosE");
        String datosC=recibedatos.getString("keyDatosC");

        txtresultadoN.setText(datosN);
        txtresultadoA.setText(datosA);
        txtresultadoE.setText(datosE);
        txtresultadoC.setText(datosC);
    }
}