//Joaquín de Souza (270366)

package Dominio;

public class Vehiculo {
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
    
    
    
    @Override
    public String toString(){
        return matricula + " - " + marca;
    }
}
