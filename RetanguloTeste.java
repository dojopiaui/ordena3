import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RetanguloTeste {
    public RetanguloTeste() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testArea() {
        Retangulo r = new Retangulo(2,3);
        assertEquals(6, r.area(), 0);

        r = new Retangulo(4,3);
        assertEquals(12, r.area(), 0);
    }    
    
    
    @Test
    public void testPerimetro (){
            Retangulo r = new Retangulo  (2,3);
            assertEquals (10 , r.perimetro(),0 );
            
            r = new Retangulo (4,3);
            assertEquals (14, r.perimetro(), 0);
            
        }       
    @After
    public void tearDown() {
    }
}
