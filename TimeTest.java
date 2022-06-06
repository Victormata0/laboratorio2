package washingsimulator;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
public class TimeTest {
    private static Time lavado;
    @Before
    public void setUp(){
        lavado= new Time("10 min","Automatico");
    }
    @Test
    public void testGetTipoWash() {
        System.out.println("GetTipoWash");
        String expResult= "Automatico";
        String result= lavado.getTipoWash();
        assertEquals(expResult,result);
    }
    @Test
    public void testGetTiempoLavado() {
        System.out.println("setTiempoLavado");
        String expResult= "10 min";
        String result= lavado.getTiempoLavado();
        assertEquals(expResult,result);
    }
    @Test
    public void testToString() {
        System.out.println("toString");
        Time instance = new Time("10 min", "Automatic");
        int expResult = 0;
        String result = instance.toString();
        assertEquals(expResult, result);
    } 
}
