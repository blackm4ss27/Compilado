package com.example.compilado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AcWeb1 extends AppCompatActivity {

    EditText web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac_web1);

        //enlazar la parte logica y diseño
        web = (EditText)findViewById(R.id.txtWeb);
    }

    public void Navegar(View view) {
        //se establecen lso cambios de pantallas
        Intent i = new Intent(this,AcWeb2.class);
        //enviar parametrosd intent, metodo put extra
        i.putExtra("SitioWeb", web.getText().toString());
        startActivity(i);
    }
}