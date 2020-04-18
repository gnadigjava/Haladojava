import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class UseRepositoryTest {

    UseRepository useRepository = new UseRepository();

    @Test
    public void testSave() {
        User user = mock(User.class);

        when(user.getName()).thenReturn("Asdf");
        useRepository.save(user);

        assertEquals(useRepository.findAll().get(0), user);
        assertEquals(useRepository.findAll().size(), 1);

    }

    @Test
    public void testGetByNeptunCode() {
        User user = mock(User.class);

        when(user.getNeptunkod()).thenReturn("ASD123");
        useRepository.save(user);

        assertEquals(useRepository.getByNektunKod("ASD123"), user);
        assertEquals(useRepository.getByNektunKod("asd"), null);
    }

    @Test
    public void testFindByEnabledIsTrue() {
        User user1 = mock(User.class);
        User user2 = mock(User.class);
        when(user1.isEnabled()).thenReturn(true);
        when(user2.isEnabled()).thenReturn(false);
        useRepository.save(user1);
        useRepository.save(user2);
        assertEquals(useRepository.findByEnabledIsTrue().get(0), user1);
        assertEquals(useRepository.findByEnabledIsTrue().size(), 1);
        // assertEquals(useRepository.findByEnabledIsTrue().get(0), user1);

    }

}