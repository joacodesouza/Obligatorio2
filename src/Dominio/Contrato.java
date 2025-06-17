//Joaquín de Souza (270366)

package Dominio;

import java.io.Serializable;

public class Contrato implements Serializable{
    private Empleado empleado;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int valorMensual;
    private int numContrato = 1;

    
    
    
    @Override
    public String toString() {
        return numContrato + " - " + vehiculo.getMatricula() + " - " + 
               cliente.getNombre() + ". Creado por: " + empleado.getNombre();
    }
   
}
