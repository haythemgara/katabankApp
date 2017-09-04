import fr.katabankapp.entities.Account;
import fr.katabankapp.entities.Operation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Test for Account class
 * @author Haythem
 */
public class AccountTest {

    /**
     * Instance of Account
     * @see Account
     */    private Account account;


    @Before //testing the instantiation of an Account object
    public void initializeTest(){
        account= new Account();
        Assert.assertNotNull(account);
    }

    @Test //Testing if the Account is not empty
    public void testAccount(){
        account.setAccountNumber("001");
        account.setBalance(0);
        account.setOpeningDate(LocalDate.of(2011,3,25));
        account.setOperations(new ArrayList<Operation>());

        Assert.assertEquals(account.getBalance(),0,0);
    }

}
