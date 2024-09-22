package tests;

import Auth.UserAuth;
import org.junit.Test;
import static org.junit.Assert.*;

public class AuthTests {
    @Test
    public void testUserRegistrationAndLogin() {
        UserAuth auth = new UserAuth();
        auth.register("testuser", "testpassword");
        assertTrue(auth.login("testuser", "testpassword"));
        assertFalse(auth.login("testuser", "wrongpassword"));
    }
}
