import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class UserControllerTest {

    UserService userService = mock(UserService.class);
    NeptunCodeGenerator neptunCodeGenerator = mock(NeptunCodeGenerator.class);

    UserController userController = new UserController(userService, neptunCodeGenerator);

    @Test
    void constructorTest() {
        UserService userService = mock(UserService.class);
        NeptunCodeGenerator neptunCodeGenerator = mock(NeptunCodeGenerator.class);
        UserController userController = new UserController(userService, neptunCodeGenerator);

    }

    @Test
    void testSave() {

        UserDto userDto = mock(UserDto.class);
        userController.save(userDto);
        verify(userService, times(1)).save(Mockito.any(User.class));

    }

}
