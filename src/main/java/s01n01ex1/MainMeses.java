package s01n01ex1;

public class MainMeses {

    public static void main(String args[]) {
        ListaMeses meses = new ListaMeses();
        meses.insertarMes("Enero");
        meses.insertarMes("Febrero");
        meses.insertarMes("Marzo");
        meses.insertarMes("Abril");
        meses.insertarMes("Mayo");
        meses.insertarMes("Junio");
        meses.insertarMes("Julio");
        meses.insertarMes("Agosto");
        meses.insertarMes("Septiembre");
        meses.insertarMes("Octubre");
        meses.insertarMes("Noviembre");
        meses.insertarMes("Diciembre");

        System.out.println(meses.getMeses());

    }
}
/*Crea una clase Java que inserte en una lista ordenada los nombres de los meses del año.
Verifica con jUnit que la lista tiene 12 posiciones, que no es nula y que en su posición 8 contiene el nombre ‘agosto’.
*/