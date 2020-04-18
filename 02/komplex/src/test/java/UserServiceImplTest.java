import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class UserServiceImplTest {

    UserModify userModify = mock(UserModify.class);

    // @SuppressWarnings("unchecked")
    Validator validator = mock(Validator.class);
    List<Validator> validatorList = new ArrayList<>();
    User user = mock(User.class);

    @Test
    void testUserServiceImpl() {

    }

    @Test
    void testSave() {
//	List<Validator> validatorList = new ArrayList<>();
//		Validator validator = mock(Validator.class);
        LengthValidator lengthValidator = mock(LengthValidator.class);
        SpaceValidator spaceValidator = mock(SpaceValidator.class);

        validatorList.add(spaceValidator);
        validatorList.add(lengthValidator);

//	User user = mock(User.class);
        User user = new User("sasdffsdf", true, "WSD852");
        UserServiceImpl userServiceImpl = new UserServiceImpl(userModify, validatorList);
        UserServiceImpl userServiceImplMocked = mock(UserServiceImpl.class);

        userModify.save(user);
        userServiceImpl.save(user);
        userServiceImplMocked.save(user);

        verify(userModify, times(1)).save(user);
        verify(userServiceImplMocked, times(1)).save(user);

        User user1 = new User("sas dffsdf", false, "WSD852");
        userModify.save(user1);
        userServiceImpl.save(user1);

//	assertEquals(um.save(user1), );
//	assertTrue(um.save(user1));
        verify(userModify, times(1)).save(user1);
//	verify(userServiceImpl, times(1)).save(user1);
        user1 = null;
        userModify.save(user1);
        userServiceImpl.save(user1);
        verify(userModify, times(1)).save(user1);

    }

    @Test
    void testIsValid() {

    }

}