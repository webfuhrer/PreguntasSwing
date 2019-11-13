/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.preguntaventanas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CDMFP
 */
public class AccesoFichero {
    private static String ruta_preguntas="C:\\preguntas\\preguntas.csv";
    public static ArrayList<Pregunta> recuperarPreguntas()
    {
        ArrayList<Pregunta> lista=new ArrayList<>();
        FileReader fr=null;
        try {
            
            fr = new FileReader(ruta_preguntas);
            BufferedReader br=new BufferedReader(fr);
            String linea=br.readLine();
            while(linea!=null)
            {
                String[] datos=linea.split(",");
                Pregunta p=new Pregunta(datos[0], datos[1]);
                lista.add(p);
                linea=br.readLine();
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }
}
