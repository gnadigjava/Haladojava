import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LogicTest {
    Logic l = new Logic();

    @Test
    void osszeadas() {
        //Mock
        //Logic l = mock(Logic.class);

        //When
        //when(l.getA()).thenReturn(5.0);
        //when(l.getB()).thenReturn(6.0);

        //Assert
        assertEquals(( l.osszeadas(5, 6)), 11.0);
    }

    @Test
    void kivonas() {
        assertEquals(( l.kivonas(5, 6)), -1.0);
    }

    @Test
    void szorzas() {
        assertEquals(( l.szorzas(5, 6)), 30);
    }

    @Test
    void szorzasNullaval() {
        assertEquals(( l.szorzas(5, 0)), 0);
    }

    @Test
    void osztas() {
        assertEquals(( l.osztas(10, 0)),Double.POSITIVE_INFINITY);
    }

    @Test
    void osztasNullavalNegativat() {
        assertEquals(( l.osztas(-10, 0)),Double.NEGATIVE_INFINITY);
    }
}