package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    UserList ul1;

    @BeforeEach
    void init(){
        ul1 = new UserList();
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        ul1.addUser("NeoAtipong","112233");
        ul1.addUser("Maou123","987654");
        ul1.addUser("Mekka","12345678");

        // TODO: find one of them
        User user = ul1.findUserByUsername("NeoAtipong");
        // TODO: assert that UserList found User
        String expected = "NeoAtipong";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        ul1.addUser("NeoAtipong","112233");
        ul1.addUser("Maou123","987654");
        ul1.addUser("Mekka","12345678");

        // TODO: change password of one user
        boolean actual = ul1.changePassword("NeoAtipong","112233","334455");
        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        ul1.addUser("NeoAtipong","112233");
        ul1.addUser("Maou123","987654");
        ul1.addUser("Mekka","12345678");

        // TODO: call login() with correct username and password
        User user = ul1.login("Maou123","987654");
        // TODO: actual assert that User object is found
        assertEquals(ul1.findUserByUsername("Maou123"), user);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        ul1.addUser("NeoAtipong","112233");
        ul1.addUser("Maou123","987654");
        ul1.addUser("Mekka","12345678");

        // TODO: call login() with incorrect username or incorrect password
        User user = ul1.login("NeoAtipong","12346789");
        // TODO: assert that the method return null
        assertNull(user);
    }
    @Test
    @DisplayName("Add user")
    public void testAddUser() {
        ul1.addUser("Atipong","23456");
        assertNotNull(ul1.findUserByUsername("Atipong"));
    }
}