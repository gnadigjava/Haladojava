package hu.me.krz.haladojava;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

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
    	List<Planet> planetList = new ArrayList<>();
    	
    	Astronomer a = new Astronomer(nev, planetList);
    	assertTrue(a.getNev().equals(nev));
    }
    @Test
    public void planetTest2() {
    	String nev = "Nem Tom";
    	List<Planet> planetList = new ArrayList<>();
    	Astronomer a = new Astronomer(nev, planetList);
    	//assertThat(a.getDiscoverdPlanets().size().is(equalTo(10)));
    }
    
    @Test
    public void valamiTest() {
    	
    }
    
    
    
    
   
}
