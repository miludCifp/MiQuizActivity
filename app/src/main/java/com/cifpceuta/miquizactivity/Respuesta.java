package com.cifpceuta.miquizactivity;

import java.util.ArrayList;

public class Respuesta {
    private String respuestaPosible;
    private boolean esCorrecta;
    public Respuesta(){}

    public Respuesta(String respuestaPosible, boolean esCorrecta) {
        this.respuestaPosible = respuestaPosible;
        this.esCorrecta = esCorrecta;
    }

    public boolean isEsCorrecta() {
        return esCorrecta;
    }
}
