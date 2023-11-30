package com.cifpceuta.miquizactivity;

import java.util.ArrayList;

public class Preguntas {
    private String pregunta;
    private ArrayList<Respuesta> respuestas;

    public Preguntas() {
    }
    public Preguntas(String pregunta, ArrayList<Respuesta> respuestas) {
        this.pregunta = pregunta;
        this.respuestas = respuestas;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

}
