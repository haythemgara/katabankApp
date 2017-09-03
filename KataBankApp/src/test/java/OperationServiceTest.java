import fr.katabankapp.entities.Account;
import fr.katabankapp.entities.Operation;
import fr.katabankapp.service.OperationService;
import fr.katabankapp.service.OperationServiceImpl;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Test for OperationService class
 * @author Haythem
 */
public class OperationServiceTest {

    @Test
    public void testingOperationService(){

        OperationService operationService= new OperationServiceImpl();

        // Create an account.
        Account account= new Account();
        account.setAccountNumber("001");
        account.setBalance(5000);
        account.setOpeningDate(LocalDate.of(2011,3,25));
        account.setOperations(new ArrayList<Operation>());

        operationService.retrive(account,250);
        operationService.deposit(account,250);
        operationService.history(account);

        Assert.assertEquals(account.getBalance(),5000,0);
    }
}
