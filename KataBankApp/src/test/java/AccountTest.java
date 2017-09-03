import fr.katabankapp.entities.Account;
import fr.katabankapp.entities.Operation;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Test for Account class
 * @author Haythem
 */
public class AccountTest {

    @Test
    public void testAccount(){

        // Create an account.
        Account account= new Account();
        account.setAccountNumber("001");
        account.setBalance(0);
        account.setOpeningDate(LocalDate.of(2011,3,25));
        account.setOperations(new ArrayList<Operation>());

        Assert.assertEquals(account.getBalance(),0,0);
    }

}
