

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TesteOrdem
{
    
    public TesteOrdem()
    {
    }

    @Test
    public void test(){
      Ordem o = new Ordem (2,3,1);
      assertEquals ("1 2 3" , o.ordem());  
    }
           
    
    @Before
    public void setUp()
    {
    }

    
    @After
    public void tearDown()
    {
    }
}
