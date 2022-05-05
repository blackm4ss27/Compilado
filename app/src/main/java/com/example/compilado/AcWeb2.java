package com.example.compilado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AcWeb2 extends AppCompatActivity {

    WebView webvista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac_web2);

        webvista = (WebView)findViewById(R.id.wv1);

        //recuperar valores por el intent
        String URL = getIntent().getStringExtra("SitioWeb");
        //permitira al user navegar solo en el app
        webvista.setWebViewClient(new WebViewClient());
        //abrira el sitio que solicito
        webvista.loadUrl("http://" + URL);
    }

    public void Cerrar(View view) {
        finish();
    }
}