import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserTest {
    @Test
    public void UserConstructorTest(){

        String nameTest = "ASfsgsdg";
        boolean enabledTest = true;
        String neptunkodTest = "RTF800";

        User user = new User(nameTest, enabledTest, neptunkodTest);

        assertEquals(user.getName(), nameTest);

        assertEquals(user.getNeptunkod(), neptunkodTest);

        assertEquals(user.isEnabled(), enabledTest);
    }


    @Test
    void testGetName() {

        User u = mock(User.class);
        when(u.getName()).thenReturn("AsdBsddh");
        Assert.assertEquals(u.getName(), "AsdBsddh");
    }

    @Test
    void testIsEnabled() {

        User u1 = mock(User.class);
        when(u1.isEnabled()).thenReturn(true);
        assertEquals(u1.isEnabled(), true);
    }

    @Test
    void testGetNeptunkod() {
        User u = mock(User.class);
        when(u.getNeptunkod()).thenReturn("EHD123");
        assertEquals(u.getNeptunkod(), "EHD123");

    }

}