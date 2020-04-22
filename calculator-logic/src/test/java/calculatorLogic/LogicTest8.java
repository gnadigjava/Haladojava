package calculatorLogic;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class LogicTest8 {

	Logic l = new Logic();


	
	@SuppressWarnings("deprecation")
	@Test
	public void testOsszeadas() {
		assertEquals((l.osszeadas(5, 6)), 11.0);
	}

	@Test
	public void testKivonas() {
		 assertEquals((l.kivonas(5, 6)), -1.0);
	}

	@Test
	public void testSzorzas() {
		assertEquals((l.szorzas(5, 6)), 30);
	}

	@Test
	 public void szorzasNullaval() {
        assertEquals((l.szorzas(5, 0)), 0);
    }

    @Test
    public void osztas() {
        assertEquals((l.osztas(10, 0)), Double.POSITIVE_INFINITY);
    }

    @Test
    public void osztasNullavalNegativat() {
        assertEquals((l.osztas(-10, 0)), Double.NEGATIVE_INFINITY);
    }

}
