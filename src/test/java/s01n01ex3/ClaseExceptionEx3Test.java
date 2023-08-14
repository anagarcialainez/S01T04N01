package s01n01ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClaseExceptionEx3Test {

    @Test
    public void dameDiaTest() {
        ClaseExceptionEx3 claseException = new ClaseExceptionEx3(7);

        assertThrows(ArrayIndexOutOfBoundsException.class,()->{claseException.dameDia(9);});

      /*  ---otra forma de hacerlo---
      //capturamos la excepción con try-catch
      try{//instanceamos la clase
            claseException.dameDia(9);
            fail("Se esperaba ArrayIndexOutOfBoundsException"); //si el método no lanza la excepcion esperada, el metodo fail se llama, lo indica que la prueba fallo
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Excepción esperada, prueba exitosa");
        }*/
    }
}