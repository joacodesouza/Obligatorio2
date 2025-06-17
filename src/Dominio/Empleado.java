//Joaquín de Souza (270366)

package Dominio;

import java.io.Serializable;

public class Empleado implements Serializable{
    private String nombre;
    private String cedula;
    private String direccion;
    private String numEmpleado;

    public Empleado(String nombre, String cedula, String direccion, String numEmpleado) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.numEmpleado = numEmpleado;
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

    public String getNumEmpleado() {
        return numEmpleado;
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

    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    
    
    
    @Override
    public String toString() {
        return cedula + " - " + nombre;
    }
    
}
