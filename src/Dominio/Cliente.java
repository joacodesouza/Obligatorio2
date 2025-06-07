//Joaquín de Souza (270366)

package Dominio;
import java.util.*;

public class Cliente {
    private String cedula;
    private String nombre;
    private String direccion;
    private String celular;
    private String añoDeIngreso;

    public Cliente(String cedula, String nombre, String direccion, String celular, String añoDeIngreso) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.celular = celular;
        this.añoDeIngreso = añoDeIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCelular() {
        return celular;
    }

    public String getAñoDeIngreso() {
        return añoDeIngreso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setAñoDeIngreso(String añoDeIngreso) {
        this.añoDeIngreso = añoDeIngreso;
    }
    
    
    
    @Override
    public String toString(){
        return cedula + " - " + nombre;
    }
}
