package com.cifpceuta.miquizactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView pregunta;
    private Button btnOpcion1, btnOpcion2, btnOpcion3, btnOpcion4, btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pregunta = (TextView) findViewById(R.id.tvPregunta);

        btnOpcion1 = (Button) findViewById(R.id.btnOpcion1);
        btnOpcion2 = (Button) findViewById(R.id.btnOpcion2);
        btnOpcion3 = (Button) findViewById(R.id.btnOpcion3);
        btnOpcion4 = (Button) findViewById(R.id.btnOpcion4);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);


    }
}