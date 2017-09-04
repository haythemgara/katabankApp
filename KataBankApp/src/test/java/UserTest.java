import fr.katabankapp.entities.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for User class
 * @author Haythem
 */
public class UserTest {

    /** Instanciate a User
     * @see User
     */
    private User user;


    @Before //testing User instantiation
    public void beforeTestingUser(){
        user = new User();

        Assert.assertNotNull(user);
    }


    @Test // testing user attributes
    public void testUser() {
        user.setFirstName("GARA");
        user.setLastName("HAYTHEM");
        user.setLogin("SG_GARA");
        user.setPwd("SG_PW$2017");

        Assert.assertEquals("GARA", user.getFirstName());
    }
}
