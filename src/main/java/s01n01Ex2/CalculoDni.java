package s01n01Ex2;

public class CalculoDni {
    private int numDni;
    private String letraDni;
    private static final String[] LETRA_DNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q",  "V", "H", "L", "C", "K", "E"};
    public CalculoDni(int numDni) {
        this.numDni = numDni;
        this.letraDni = calcularLetraDni(numDni);
    }
    public int getNumDni() {
        return numDni;
    }
    public String getLetraDni() {
        return letraDni;
    }
    public String calcularLetraDni(int numDni){
        int indice;
        indice = numDni % 23 ;
        return LETRA_DNI[indice];
    }

    @Override
    public String toString() {
        return numDni + "-" + letraDni ;
    }
}

/*Crea una clase llamada CalculoDni que calcule la letra del DNI al recibir el número como parámetro.
Crea una clase jUnit que verifique su correcto funcionamiento, parametrizándola para que el test reciba un
espectro de datos amplio y valide si el cálculo es correcto para 10 números de DNI predefinidos.
*/