//Joaquín de Souza (270366)

package Dominio;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ServicioAdicional implements Serializable{
    private String tipo;
    private Vehiculo vehiculo;
    private Empleado empleado;
    private LocalDateTime fechaHora;
    private int costo;

    public ServicioAdicional(String tipo, Vehiculo vehiculo, Empleado empleado, LocalDateTime fechaHora, int costo) {
        this.tipo = tipo;
        this.vehiculo = vehiculo;
        this.empleado = empleado;
        this.fechaHora = fechaHora;
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
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

    public int getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return tipo + " - " + vehiculo.getMatricula() + " - " + fechaHora.toString();
    }
}
