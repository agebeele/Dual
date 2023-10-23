package com.example.dual;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class formulario_credencial extends AppCompatActivity {

    TextView numeroControl, grupo, apellidoPaterno, apellidoMaterno, nombre, fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_credencial);

        numeroControl = (EditText) findViewById(R.id.ingresa_numeroControl);
        grupo = (EditText) findViewById(R.id.ingresa_grupo);
        apellidoPaterno = (EditText) findViewById(R.id.ingresa_paterno);
        apellidoMaterno = (EditText) findViewById(R.id.ingresa_materno);
        nombre = (EditText) findViewById(R.id.ingresa_nombre);
        fecha = (EditText) findViewById(R.id.ingresa_fecha);
    }
    public void enviarDatosCredencial(View view) {

        numeroControl.setText("");
        grupo.setText("");
        apellidoPaterno.setText("");
        apellidoMaterno.setText("");
        nombre.setText("");
        fecha.setText("");

        Toast.makeText(formulario_credencial.this, "Solicitud enviada",Toast.LENGTH_SHORT).show();
    }
    public void regresarPantalla (View view){
        onBackPressed();
    }
}