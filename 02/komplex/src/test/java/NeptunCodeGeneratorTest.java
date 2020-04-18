import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class NeptunCodeGeneratorTest {

    @Test
    void testGetNextCounter() {

        NeptunCodeGenerator neptunCodeGenerator = new NeptunCodeGenerator();

        assertEquals(neptunCodeGenerator.getNextCounter(), 0);
//	assertEquals(neptunCodeGenerator.getNextCounter(), 1);

    }

}
