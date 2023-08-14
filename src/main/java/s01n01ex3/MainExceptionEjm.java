package s01n01ex3;

import s01n01Ex2.CalculoDni;
import s01n01ex1.ListaMeses;

import java.util.Scanner;

public class MainExceptionEjm {
    public static void main(String args[]) {
        int indice;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese número día (1 al 7):");
        indice = entrada.nextInt();

        ClaseExceptionEx3 dia = new ClaseExceptionEx3(indice);

        System.out.println("El dia es :" + dia.dameDia(indice));



    }

}
