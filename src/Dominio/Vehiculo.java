//Joaquín de Souza (270366)

package Dominio;

import java.io.Serializable;

public class Vehiculo implements Serializable{
    private String matricula;
    private String marca;
    private String modelo;
    private String estado;

    public Vehiculo(String matricula, String marca, String modelo, String estado) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    @Override
    public String toString(){
        return matricula + " - " + marca;
    }
}
