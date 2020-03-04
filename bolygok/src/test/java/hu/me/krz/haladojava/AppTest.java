package hu.me.krz.haladojava;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void planetTest() {
    	String nev = "Nem Tom";
    	
    	Astronomer a = new Astronomer(nev);
    	assertTrue(a.getNev().equals(nev));
    }
    @Test
    public void planetTest2() {
    	String nev = "Nem Tom";
    	
    	Astronomer a = new Astronomer(nev);
    	//assertThat(a.getNev().equals(nev));
    }
    
    
   
}
