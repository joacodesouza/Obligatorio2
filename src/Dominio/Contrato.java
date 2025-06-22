//Joaquín de Souza (270366)

package Dominio;

import java.io.Serializable;

public class Contrato implements Serializable{
    private Empleado empleado;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int valorMensual;
    private int numContrato;
    private static int contador = 1;

    public Contrato(Cliente cliente, Vehiculo vehiculo, Empleado empleado,
                    int valorMensual) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.empleado = empleado;
        this.valorMensual = valorMensual;
        numContrato = contador++;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public int getValorMensual() {
        return valorMensual;
    }

    public int getNumContrato() {
        return numContrato;
    }
    
    public void decrementarContador() {
        if (contador > 1) {
            contador--;
        }
    }
    
    
    @Override
    public String toString() {
        return numContrato + " - " + vehiculo.getMatricula() + " - " + 
               cliente.getNombre() + ". Creado por: " + empleado.getNombre();
    }
   
}
