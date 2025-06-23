//Joaquín de Souza (270366)

package Dominio;

import java.io.Serializable;
import java.util.*;

public class ElementoObservable extends Observable implements Serializable{

    public void notificar(){
        setChanged();
        notifyObservers();
    }
}
