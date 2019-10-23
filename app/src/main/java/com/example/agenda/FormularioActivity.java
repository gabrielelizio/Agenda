package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import android.widget.Button;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        Button botaoSalvar = (Button) findViewById(R.id.formulario_salvar);
        botaoSalvar.setOnClickListener( new View.OnClickListener(){

            public void onClick(View view){
            Toast.makeText(FormularioActivity.this, "Dados Salvos com sucesso.",Toast.LENGTH_SHORT).show();
            Intent vaiPramain = new Intent(FormularioActivity.this, MainActivity.class);
            finish();
            }
        });
    }
}
