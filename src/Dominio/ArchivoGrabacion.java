package Dominio;

import java.util.*;
import java.io.*;

public class ArchivoGrabacion {
    private Formatter out;
    public ArchivoGrabacion(String unNombre){
        try {
            out = new Formatter(unNombre);
        }
        catch(FileNotFoundException e){
            System.out.println("No se puede crear el archivo");
            System.exit(1);
        }
    }
    public ArchivoGrabacion(String unNombre, boolean extender){
        try {
            FileWriter f = new FileWriter(unNombre, extender);
            out = new Formatter(f);
        }
        catch(IOException e){
            System.out.println("No se puede crear el archivo");
            System.exit(1);
        }
    }
    public void grabarLinea(String linea){
        out.format("%s%n", linea);
    }
    public void cerrar(){
        out.close();
    }
}