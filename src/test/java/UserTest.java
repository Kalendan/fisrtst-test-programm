import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user = new User();

    @BeforeEach
    public void init() {
        User user = new User();
    }

    @Test
    void getLogin_validLogin_success() {

        String validLogin = "validLogin";
        user.getLogin(validLogin);
        assertEquals(validLogin,user.getLogin());

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            user.getLogin();
            String login = "abc";
            user.getLogin();}
            assertEquals("abc", user.getLogin());
            String condition = "Логин должен быть не менее 3 символов!";
            assertThrows(RuntimeException.class, () -> user.getLogin(condition));
        }


    @Test
    void getPassword_validPassword_success() {
        User user = new User();
        String validPassword = "validPassword";
        user.setPassword(validPassword);
        assertEquals(validPassword,user.getPassword());
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            user.setPassword(validPassword);
            assertEquals(validPassword, user.getPassword());
            String condition = "Пароль должен быть не менее 8 символов!";
            assertThrows(RuntimeException.class, () -> user.getPassword(condition));
        }

    @Test
    void getEmail_validEmail_success() {
                user.setEmail("test@example.com");
                assertEquals("test@example.com", user.getEmail());
    }

    @Test
    void setLogin_validLogin_success() {
            user.setLogin("User");
            assertEquals("User", user.getLogin());
            assertThrows(IllegalArgumentException.class, () -> user.setLogin(null));
    }

    @Test
    void setPassword_validPassword_success() {
            assertEquals("abc", user.setPassword());
            assertNotEquals(user.setPassword());
                assertTrue(user.setPassword("User"));
                assertFalse(user.setPassword(" "));
                assertNull(user.setPassword(null));
                assertNotNull(user.setPassword("User"));
                assertThrows(IllegalArgumentException.class, () -> user.setPassword(null));
    }

    @Test
    void setEmail_validEmail_success() {
                assertEquals("@",user.setEmail("test@example.com"));
                assertNotEquals(user.setEmail());
                assertTrue(user.setEmail("EmailTrue"));
                assertFalse(user.setEmail("EmailWrong"));
                assertNull(user.setEmail(null));
                assertNotNull(user.setEmail("Emailadress"));
                assertThrows(IllegalArgumentException.class, () -> user.setEmail("invalid-email"));
            }

    @Test
    void inValidPassword() {
            assertEquals(user.inValidPassword());
            assertNotEquals(user.inValidPassword());
            assertTrue(user.inValidPassword("passwordTrue"));
            assertFalse(user.inValidPassword("passwordWrong"));
            assertNull(user.inValidPassword(null));
            assertNotNull(user.inValidPassword("password"));
        }
    }


//Ваша задача - написать тесты для каждого метода класса User с использованием библиотеки JUnit 5.

//Напишите тестовый класс UserTest, в котором будут тесты для каждого метода класса User.
//Используйте аннотацию @Test для каждого тестового метода.
//Используйте методы утверждений (assertEquals, assertNotEquals, assertTrue, assertFalse, assertNull, assertNotNull) для проверки правильности работы каждого метода.
//Напишите тест для проверки исключения IllegalArgumentException в методах setLogin, setPassword и setEmail.
//Напишите тест для проверки метода  inValidPassword.