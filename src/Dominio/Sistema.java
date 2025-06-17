//Joaquín de Souza (270366)

package Dominio;
import java.io.Serializable;
import java.util.*;
import javax.swing.JOptionPane;

public class Sistema implements Serializable{
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Vehiculo> listaVehiculos;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Contrato> listaContratos;


    public Sistema() {
        this.listaClientes =  new ArrayList<>();
        this.listaVehiculos = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
        this.listaContratos = new ArrayList<>();
    }
    
    

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public ArrayList<Contrato> getListaContratos() {
        return listaContratos;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void setListaContratos(ArrayList<Contrato> listaContratos) {
        this.listaContratos = listaContratos;
    }
    
    //APARTADO CLIENTES
    
    public ArrayList<Cliente> agregarCliente(Cliente unCliente) {
        if (clienteYaExiste(unCliente)) {
            JOptionPane.showMessageDialog(null, "El cliente ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            listaClientes.add(unCliente);
            JOptionPane.showMessageDialog(null, "El cliente ha sido resgistrado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
        return listaClientes;
    }
    
    private boolean clienteYaExiste(Cliente unCliente){
        for(Cliente cliente : listaClientes ){
            if (cliente.getCedula().equals(unCliente.getCedula())){
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Cliente> eliminarCliente(Cliente unCliente) {
        if (listaClientes.remove(unCliente)) {
            JOptionPane.showMessageDialog(null, "El cliente ha sido eliminado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El cliente no existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return listaClientes;
    }
    
    //APARTADO VEHICULOS
    
    public ArrayList<Vehiculo> agregarVehiculo(Vehiculo unVehiculo) {
        if (vehiculoYaExiste(unVehiculo)) {
            JOptionPane.showMessageDialog(null, "La matricula ya está registrada", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            listaVehiculos.add(unVehiculo);
            JOptionPane.showMessageDialog(null, "El vehículo ha sido resgistrado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
        return listaVehiculos;
    }
    
    private boolean vehiculoYaExiste(Vehiculo unVehiculo){
        for(Vehiculo vehiculo : listaVehiculos ){
            if (vehiculo.getMatricula().equals(unVehiculo.getMatricula())){
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Vehiculo> eliminarVehiculo(Vehiculo unVehiculo) {
        if (listaVehiculos.remove(unVehiculo)) {
            JOptionPane.showMessageDialog(null, "El vehículo ha sido eliminado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El vehículo no existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return listaVehiculos;
    }
    
    //APARTADO EMPLEADOS
    
    public ArrayList<Empleado> agregarEmpleado(Empleado unEmpleado) {
        if (vehiculoYaExiste(unEmpleado)) {
            JOptionPane.showMessageDialog(null, "El empleado ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            listaEmpleados.add(unEmpleado);
            JOptionPane.showMessageDialog(null, "El empleado ha sido resgistrado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
        return listaEmpleados;
    }
    
    private boolean vehiculoYaExiste(Empleado unEmpleado){
        for(Empleado empleado : listaEmpleados ){
            if (empleado.getCedula().equals(unEmpleado.getCedula())){
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Empleado> eliminarEmpleado(Empleado unEmpleado) {
        if (listaEmpleados.remove(unEmpleado)) {
            JOptionPane.showMessageDialog(null, "El empleado ha sido eliminado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El empleado no existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return listaEmpleados;
    }
}
