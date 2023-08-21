package s01n01Ex2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {
    @ParameterizedTest
    @CsvSource({"85024284,T","14103273,H","12485329,D","53852437,F","36919354,F","11895773,N","84874523,S","55586272,X","87733128,L","80439150,P"})

    void calcularLetraDniTest(int numDni,String letraDniEsperada) {
        CalculoDni dni = new CalculoDni(numDni);
        assertEquals(letraDniEsperada,dni.getLetraDni(),"Error para el número de DNI: " + numDni);

    }
}