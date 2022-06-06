package washingsimulator;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
public class ClienteHabitualTest {
    public ClienteHabitualTest() {
    }private static ClienteHabitual cliente;
    @Before
    public void setUp(){
       cliente= new ClienteHabitual("Victor","Mata","Cliente habitual") ;
    }
    /**
     * Test of imprimir method, of class ClienteNuevo.
     */
    @Test
    public void testImprimir() {
        System.out.println("El nombre del cliente");
        String result1 = cliente.getNombre();
        String expResult1 ="Victor";
        assertEquals(expResult1, result1);
        
        System.out.println("El apellido del cliente");
        String result2 = cliente.getApellidos();
        String expResult2 = "Mata";
        assertEquals(expResult2, result2);
        
        System.out.println("El tipo de cliente");
        String result3 = cliente.getTipoCliente();
        String expResult3 = "Cliente habitual";
        assertEquals(expResult3, result3);
    }
}
