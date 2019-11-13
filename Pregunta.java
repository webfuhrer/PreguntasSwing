/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.preguntaventanas;

/**
 *
 * @author CDMFP
 */
public class Pregunta {
    private String texto_pregunta, texto_respuesta;

    public Pregunta(String texto_pregunta, String texto_respuesta) {
        this.texto_pregunta = texto_pregunta;
        this.texto_respuesta = texto_respuesta;
    }

    public String getTexto_pregunta() {
        return texto_pregunta;
    }

    public String getTexto_respuesta() {
        return texto_respuesta;
    }
    
}
