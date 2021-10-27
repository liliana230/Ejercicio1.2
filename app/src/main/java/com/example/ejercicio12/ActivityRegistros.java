package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityRegistros extends AppCompatActivity {

    EditText nombres,apellidos,edad,correo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registros);

        nombres = (EditText) findViewById(R.id.txtnombre);
        apellidos= (EditText) findViewById(R.id.txtapellidos);
        edad= (EditText) findViewById(R.id.txtedad);
        correo= (EditText) findViewById(R.id.txtcorreo);
        Button btnenviar =(Button) findViewById(R.id.btnenviar);

        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Bundle enviadatos= new Bundle();
                enviadatos.putString("keyDatosN",nombres.getText().toString());
                enviadatos.putString("keyDatosA",apellidos.getText().toString());
                enviadatos.putString("keyDatosE",edad.getText().toString());
                enviadatos.putString("keyDatosC",correo.getText().toString());

                Intent intent = new Intent(ActivityRegistros.this, ActivityDatos.class);
                intent.putExtras(enviadatos);
                startActivity(intent);
            }
        });
    }
}