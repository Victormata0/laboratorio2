package washingsimulator;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
public class ClienteNuevoTest {
    
    public ClienteNuevoTest() {
    }
    private static ClienteNuevo cliente;
    @Before
    public void setUp(){
       cliente= new ClienteNuevo("Merari","Perdomo","Cliente nuevo") ;
    }
        
    /**
     * Test of imprimir method, of class ClienteNuevo.
     */
    @Test
    public void testImprimir() {
        System.out.println("El nombre del cliente");
        String result1 = cliente.getNombre();
        String expResult1 ="Merari";
        assertEquals(expResult1, result1);
        
        System.out.println("El apellido del cliente");
        String result2 = cliente.getApellidos();
        String expResult2 = "Perdomo";
        assertEquals(expResult2, result2);
        
        System.out.println("El tipo de cliente");
        String result3 = cliente.getTipoCliente();
        String expResult3 = "Cliente nuevo";
        assertEquals(expResult3, result3);
    }
    
}
