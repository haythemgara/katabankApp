import fr.katabankapp.entities.User;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for User class
 * @author Haythem
 */
public class UserTest {

    @Test
    public void testUser() {
        // Create a user
        User user = new User();
        user.setFirstName("GARA");
        user.setLastName("HAYTHEM");
        user.setLogin("SG_GARA");
        user.setPwd("SG_PW$2017");
        Assert.assertEquals("GARA", user.getFirstName());
    }
}
