//Joaquín de Souza (270366)

package Dominio;
import Interfaz.*;

public class Oblig2 {

    public static void main(String[] args) {
        Sistema sist = new Sistema();
        VentanaInicio vent = new VentanaInicio(sist);
        vent.setVisible(true);
    }
    
}
