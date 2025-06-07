//Joaquín de Souza (270366)

package Dominio;
import java.util.*;
import javax.swing.JOptionPane;

public class Sistema {
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Vehiculo> listaVehiculos;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Contrato> listaContratos;

//    public Sistema(ArrayList<Cliente> listaClientes, ArrayList<Vehiculo> listaVehiculos, ArrayList<Empleado> listaEmpleados, ArrayList<Contrato> listaContratos) {
//        this.listaClientes = new ArrayList<>();
//        this.listaVehiculos = new ArrayList<>();
//        this.listaEmpleados = new ArrayList<>();
//        this.listaContratos = new ArrayList<>();
//    }
    
    

    public ArrayList<Cliente> getListaClientes() {
        if (listaClientes == null) {
            listaClientes = new ArrayList<>();
        }
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
    
    public ArrayList<Cliente> agregarCliente(Cliente unCliente) {
        if (listaClientes == null) {
            listaClientes = new ArrayList<>();
        }
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
}
