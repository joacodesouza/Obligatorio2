//Joaquín de Souza (270366)

package Dominio;
import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;
import javax.swing.JOptionPane;

public class Sistema extends Observable implements Serializable{
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Vehiculo> listaVehiculos;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Contrato> listaContratos;
    private ArrayList<Entrada> listaEntradas;
    private ArrayList<Salida> listaSalidas;
    private ArrayList<ServicioAdicional> listaServicios;
    private ElementoObservable obs;


    public Sistema() {
        this.listaClientes =  new ArrayList<>();
        this.listaVehiculos = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
        this.listaContratos = new ArrayList<>();
        this.listaEntradas = new ArrayList<>();
        this.listaSalidas = new ArrayList<>();
        this.listaServicios = new ArrayList<>();
        obs = new ElementoObservable();
        
    }
    

    public ArrayList<Cliente> getListaClientes() {
        setChanged();
        notifyObservers();
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
    
    public ArrayList<Entrada> getListaEntradas() {
        return listaEntradas;
    }

    public ArrayList<Salida> getListaSalidas() {
        return listaSalidas;
    }

    public ArrayList<ServicioAdicional> getListaServicios() {
        return listaServicios;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
        setChanged();
        notifyObservers();
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
    
    public void setListaEntradas(ArrayList<Entrada> listaEntradas) {
        this.listaEntradas = listaEntradas;
    }

    public void setListaSalidas(ArrayList<Salida> listaSalidas) {
        this.listaSalidas = listaSalidas;
    }

    public void setListaServicios(ArrayList<ServicioAdicional> listaServicios) {
        this.listaServicios = listaServicios;
    }
    
    //APARTADO CLIENTES
    
    public ArrayList<Cliente> agregarCliente(Cliente unCliente) {
        if (clienteYaExiste(unCliente)) {
            JOptionPane.showMessageDialog(null, "El cliente ya existe", "Error",
            JOptionPane.ERROR_MESSAGE);
        } else {
            listaClientes.add(unCliente);
            JOptionPane.showMessageDialog(null, "El cliente ha sido resgistrado", 
            "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
        obs.notificar();
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
        eliminarContratosPorCliente(unCliente);
        if (listaClientes.remove(unCliente)) {
            JOptionPane.showMessageDialog(null, "El cliente ha sido eliminado", 
            "Informacion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El cliente no existe", "Error", 
            JOptionPane.ERROR_MESSAGE);
        }
        obs.notificar();
        return listaClientes;
    }
    
    //APARTADO VEHICULOS
    
    public ArrayList<Vehiculo> agregarVehiculo(Vehiculo unVehiculo) {
        if (vehiculoYaExiste(unVehiculo)) {
            JOptionPane.showMessageDialog(null, "La matricula ya está registrada", 
            "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            listaVehiculos.add(unVehiculo);
            JOptionPane.showMessageDialog(null, "El vehículo ha sido resgistrado", 
            "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
        obs.notificar();
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
            JOptionPane.showMessageDialog(null, "El vehículo ha sido eliminado", 
            "Informacion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El vehículo no existe", "Error", 
            JOptionPane.ERROR_MESSAGE);
        }
        obs.notificar();
        return listaVehiculos;
    }
    
    //APARTADO EMPLEADOS
    
    public ArrayList<Empleado> agregarEmpleado(Empleado unEmpleado) {
        if (empleadoYaExiste(unEmpleado)) {
            JOptionPane.showMessageDialog(null, "El empleado ya existe", "Error", 
            JOptionPane.ERROR_MESSAGE);
        } else {
            listaEmpleados.add(unEmpleado);
            JOptionPane.showMessageDialog(null, "El empleado ha sido resgistrado", 
            "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
        obs.notificar();
        return listaEmpleados;
    }
    
    private boolean empleadoYaExiste(Empleado unEmpleado){
        for(Empleado empleado : listaEmpleados ){
            if (empleado.getCedula().equals(unEmpleado.getCedula())){
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Empleado> eliminarEmpleado(Empleado unEmpleado) {
        if (listaEmpleados.remove(unEmpleado)) {
            JOptionPane.showMessageDialog(null, "El empleado ha sido eliminado", 
            "Informacion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El empleado no existe", "Error", 
            JOptionPane.ERROR_MESSAGE);
        }
        obs.notificar();
        return listaEmpleados;
    }
    
    //APARTADO CONTRATOS

    public ArrayList<Contrato> agregarContrato(Contrato unContrato) {
        listaContratos.add(unContrato);
        JOptionPane.showMessageDialog(null, "El contrato ha sido registrado", 
        "Informacion", JOptionPane.INFORMATION_MESSAGE);
        obs.notificar();
        return listaContratos;
    }

    public ArrayList<Contrato> eliminarContratosPorCliente(Cliente unCliente) {
        Iterator<Contrato> it = listaContratos.iterator();
        while (it.hasNext()) {
            Contrato c = it.next();
            if (c.getCliente().equals(unCliente)) {
                it.remove();
                c.decrementarContador();
            }
        }
        obs.notificar();
        return listaContratos;
    }
    
    // APARTADO MOVIMIENTOS

    public boolean tieneContrato(Vehiculo v) {
        for (Contrato c : listaContratos) {
            if (c.getVehiculo().equals(v)) {
                return true;
            }
        }
        return false;
    }

    private boolean salidaRegistrada(Entrada e) {
        for (Salida s : listaSalidas) {
            if (s.getEntrada().equals(e)) {
                return true;
            }
        }
        return false;
    }

    public boolean vehiculoDentro(Vehiculo v) {
        for (Entrada e : listaEntradas) {
            if (e.getVehiculo().equals(v) && !salidaRegistrada(e)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Vehiculo> vehiculosDisponiblesParaEntrada() {
        ArrayList<Vehiculo> lista = new ArrayList<>();
        for (Vehiculo v : listaVehiculos) {
            if (!vehiculoDentro(v)) {
                lista.add(v);
            }
        }
        return lista;
    }

    public ArrayList<Entrada> getEntradasAbiertas() {
        ArrayList<Entrada> lista = new ArrayList<>();
        for (Entrada e : listaEntradas) {
            if (!salidaRegistrada(e)) {
                lista.add(e);
            }
        }
        return lista;
    }

    public Entrada registrarEntrada(Vehiculo v, Empleado e, LocalDateTime fh, String notas) {
        if (vehiculoDentro(v)) {
            JOptionPane.showMessageDialog(null, "El vehículo ya está dentro del parking", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        Entrada ent = new Entrada(v, e, fh, notas);
        listaEntradas.add(ent);
        String contrato = tieneContrato(v) ? "Tiene contrato" : "No tiene contrato";
        JOptionPane.showMessageDialog(null, contrato, "Información", JOptionPane.INFORMATION_MESSAGE);
        obs.notificar();
        return ent;
    }

    public Salida registrarSalida(Entrada ent, Empleado e, LocalDateTime fh, String notas) {
        if (salidaRegistrada(ent)) {
            JOptionPane.showMessageDialog(null, "La entrada ya tiene registrada una salida", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        if (fh.isBefore(ent.getFechaHora())) {
            JOptionPane.showMessageDialog(null, "La fecha/hora de salida debe ser posterior a la entrada", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        Salida sal = new Salida(ent, e, fh, notas);
        listaSalidas.add(sal);
        Duration dur = Duration.between(ent.getFechaHora(), fh);
        long horas = dur.toHours();
        long minutos = dur.toMinutes() % 60;
        String contrato = tieneContrato(ent.getVehiculo()) ? "Tiene contrato" : "No tiene contrato";
        JOptionPane.showMessageDialog(null, "Tiempo en parking: " + horas + " horas " + minutos + " minutos\n" + contrato, "Información", JOptionPane.INFORMATION_MESSAGE);
        obs.notificar();
        return sal;
    }

    public ServicioAdicional registrarServicio(String tipo, Vehiculo v, Empleado e, LocalDateTime fh, int costo) {
        ServicioAdicional ser = new ServicioAdicional(tipo, v, e, fh, costo);
        listaServicios.add(ser);
        obs.notificar();
        return ser;
    }
    
    public void addObserver(Object obj){
        obs.addObserver((Observer)obj);
    }
}
