import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserDtoTest {

    @Test
    void testUserDto() {

        String string = "vmi";
        UserDto userDto = new UserDto(string);

        assertEquals(userDto.getName(), "vmi");

    }

    @Test
    void testGetName() {

        // UserDto userDto = mock(UserDto.class);
        UserDto userDto = new UserDto("jhkjlg");
        // when(userDto.getName()).thenReturn("asd");
        assertEquals(userDto.getName(), "jhkjlg");

    }

    @Test
    void testSetName() {
        UserDto userDto = new UserDto("sidufhhd");
        String string = "uzkouihbhhr";
        userDto.setName(string);
        assertEquals(userDto.getName(), "uzkouihbhhr");

    }

}