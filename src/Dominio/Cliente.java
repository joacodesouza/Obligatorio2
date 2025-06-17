//Joaquín de Souza (270366)

package Dominio;
import java.io.Serializable;
import java.util.*;

public class Cliente implements Serializable{
    private String cedula;
    private String nombre;
    private String direccion;
    private String celular;
    private String anioDeIngreso;

    public Cliente(String cedula, String nombre, String direccion, String celular, String anioDeIngreso) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.celular = celular;
        this.anioDeIngreso = anioDeIngreso;
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

    public String getAnioDeIngreso() {
        return anioDeIngreso;
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

    public void setAnioDeIngreso(String añoDeIngreso) {
        this.anioDeIngreso = añoDeIngreso;
    }
    
    
    
    @Override
    public String toString(){
        return cedula + " - " + nombre;
    }
}
