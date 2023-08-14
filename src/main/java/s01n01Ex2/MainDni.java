package s01n01Ex2;

import java.util.Scanner;

public class MainDni {
    public static void main(String args[]) {
        int numDni;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese número de DNI:");
        numDni = entrada.nextInt();

        CalculoDni dni = new CalculoDni(numDni);

        System.out.println("El DNI es :" + dni.toString());

    }
}
