package s01n01ex3;

import java.util.ArrayList;
import java.util.List;

public class ClaseExceptionEx3 {
    private int indice;
    private String dia;
    private static final String[] DIAS = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};

    public ClaseExceptionEx3(int indice) {
        this.indice = indice;
        this.dia = dia;
    }

    public String dameDia(int indice){
        return DIAS[indice-1];
    }

    @Override
    public String toString() {
        return " El dia en el índice " + indice + " es " + dia ;
    }
}
/*Crea una clase con un método que arroje una ArrayIndexOutOfBoundsException.
Verifica su correcto funcionamiento con un test jUnit.*/