package com.cifpceuta.miquizactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView tvPregunta;
    private Button btnOpcion1, btnOpcion2, btnOpcion3, btnOpcion4, btnEnviar;
    private Preguntas unaPregunta;
    private ArrayList<Preguntas> respuestasUsuario;
    private Respuesta unaRespuesta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPregunta = (TextView) findViewById(R.id.tvPregunta);

        btnOpcion1 = (Button) findViewById(R.id.btnOpcion1);
        btnOpcion2 = (Button) findViewById(R.id.btnOpcion2);
        btnOpcion3 = (Button) findViewById(R.id.btnOpcion3);
        btnOpcion4 = (Button) findViewById(R.id.btnOpcion4);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);


    }
    //En este metodo creo las preguntas
    private void cargarPreguntaYRespuestas(){
        //Creo las respuetas
        Respuesta resp1 = new Respuesta("respuesta 1 ",false);
        Respuesta resp2 = new Respuesta("respuesta 2 ",true);
        Respuesta resp3 = new Respuesta("respuesta 3 ",false);
        Respuesta resp4 = new Respuesta("respuesta 4 ",false);
        //Guardo las respuestas en un ArrayList
        ArrayList<Respuesta> respuestasPosibles = new ArrayList<>();
        respuestasPosibles.add(resp1);
        respuestasPosibles.add(resp2);
        respuestasPosibles.add(resp3);
        respuestasPosibles.add(resp4);
        //Creo la primera pregunta
        String pregunta1 = "Hola";
        unaPregunta = new Preguntas(pregunta1,respuestasPosibles);
        //Cargo la pregunta 1 en la interfaz
        tvPregunta.setText(unaPregunta.getPregunta());
        //Cargo las respuestas de la pregunta 1 en los botones de las opciones en la interfaz.
        btnOpcion1.setText(unaPregunta.getRespuestas().get(0));
        btnOpcion1.setText(unaPregunta.getRespuestas().get(1));
        btnOpcion1.setText(unaPregunta.getRespuestas().get(2));
        btnOpcion1.setText(unaPregunta.getRespuestas().get(3));

        btnOpcion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarRespuestaUsuario();
            }
        });

    }
    private void guardarRespuestaUsuario(){
        String opcion1 = btnOpcion1.getText().toString();
        String opcion2 = btnOpcion2.getText().toString();
        String opcion3 = btnOpcion3.getText().toString();
        String opcion4 = btnOpcion4.getText().toString();






    }
    //Este metodo se le pasa la respuesta correcta, busca en el array de respuestas posibles y guarda la correcta luego la devuelve.
    private String respuestaCorrecta(String respCorrecta){
        ArrayList<String> respuestas = unaPregunta.getRespuestas();
        String rpCorrecta = "";
        for (String resp : respuestas){
            if (resp.equalsIgnoreCase(respCorrecta)){
                //Guardo la respuesta correcta y la retorno.
                rpCorrecta = resp;
            }
        }
        return rpCorrecta;
    }
}