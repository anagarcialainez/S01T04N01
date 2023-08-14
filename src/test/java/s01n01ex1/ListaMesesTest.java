package s01n01ex1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListaMesesTest {
    private ListaMeses listaMeses;

    @BeforeEach
    public void setUp() {
       listaMeses = new ListaMeses();
       listaMeses.insertarMes("Enero");
       listaMeses.insertarMes("Febrero");
       listaMeses.insertarMes("Marzo");
       listaMeses.insertarMes("Abril");
       listaMeses.insertarMes("Mayo");
       listaMeses.insertarMes("Junio");
       listaMeses.insertarMes("Julio");
       listaMeses.insertarMes("Agosto");
       listaMeses.insertarMes("Septiembre");
       listaMeses.insertarMes("Octubre");
       listaMeses.insertarMes("Noviembre");
       listaMeses.insertarMes("Diciembre");
    }

    @Test
    public void tamanoListaTest() {
        assertEquals(12, listaMeses.getMeses().size());
    }

    @Test
    public void ListaNoNulaTest() {
        assertNotNull(listaMeses.getMeses());
    }

    @Test
    public void posicionAgostoTest() {
        List<String> meses = listaMeses.getMeses();
        assertNotNull("Agosto",meses.get(7));
    }

}