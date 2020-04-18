import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class LengthValidatorTest {
    LengthValidator lengthValidator = new LengthValidator();

    @Test
    void IsUserNameLongEnough() {
        //mock
        User user = mock(User.class);
        //when
        when(user.getName()).thenReturn("Somethingsomething");
        //assert
        assertTrue(lengthValidator.isValid(user));
    }

    @Test
    void IsUserNameTooShort() {
        //mock
        User user = mock(User.class);
        //when
        when(user.getName()).thenReturn("Rude");
        //assert
        assertFalse(lengthValidator.isValid(user));
    }
}