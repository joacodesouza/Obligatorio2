//Joaquín de Souza (270366)

package Dominio;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Entrada implements Serializable{
    private Vehiculo vehiculo;
    private Empleado empleado;
    private LocalDateTime fechaHora;
    private String notas;
    
    public Entrada(Vehiculo vehiculo, Empleado empleado, LocalDateTime fechaHora, String notas) {
        this.vehiculo = vehiculo;
        this.empleado = empleado;
        this.fechaHora = fechaHora;
        this.notas = notas;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public String getNotas() {
        return notas;
    }

    @Override
    public String toString() {
        return vehiculo.toString() + " - " + fechaHora.toString();
    }
}
