//Joaquín de Souza (270366)

package Dominio;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Salida implements Serializable{
    private Entrada entrada;
    private Empleado empleado;
    private LocalDateTime fechaHora;
    private String notas;

    public Salida(Entrada entrada, Empleado empleado, LocalDateTime fechaHora, String notas) {
        this.entrada = entrada;
        this.empleado = empleado;
        this.fechaHora = fechaHora;
        this.notas = notas;
    }

    public Entrada getEntrada() {
        return entrada;
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
        return entrada.getVehiculo().toString() + " - " + fechaHora.toString();
    }
}
