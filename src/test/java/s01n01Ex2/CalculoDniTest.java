package s01n01Ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {

    @Test
    void calcularLetraDniTest() {
        int[] numDniTest = {85024284,14103273,12485329,53852437,36919354,11895773,84874523,84874523,87733128,80439150};
        String[] letrasDniEsperadas ={"T","H","D","F","F","N","S","S","L","P"};

        for(int i=0; i<numDniTest.length; i++){
        CalculoDni dni = new CalculoDni(numDniTest[i]);
        assertEquals(letrasDniEsperadas[i],dni.getLetraDni(),"Error para el número de DNI: " + numDniTest[i]);
        }
    }
}