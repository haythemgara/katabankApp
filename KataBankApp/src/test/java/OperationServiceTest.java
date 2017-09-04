import fr.katabankapp.entities.Account;
import fr.katabankapp.entities.Operation;
import fr.katabankapp.service.OperationService;
import fr.katabankapp.service.OperationServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Test for OperationService class
 * @author Haythem
 */
public class OperationServiceTest {


    /**  instance of operationService to execute operations
     * @see OperationService
     */
    private OperationService operationService=new OperationServiceImpl();

    /**
     *  instance of Account
     *  @see Account
     */
    private Account account;


    @Before // testing the instance of account
    public void initializeOperationServiceTest(){
        account= new Account();
        account.setAccountNumber("001");
        account.setBalance(5000);
        account.setOpeningDate(LocalDate.of(2011,3,25));
        account.setOperations(new ArrayList<Operation>());

        Assert.assertNotNull(account);
    }

    @Test //testing the retrive operation
    public void testingRetrive(){
        operationService.retrive(account,250);
        Assert.assertEquals(account.getBalance(),4750,0);
    }

    @Test //testing the deposit operation
    public void testingDeposit(){
        operationService.deposit(account,250);
        Assert.assertEquals(account.getBalance(),5250,0);
    }

    @Test //testing the history operation
    public void testingHistory(){
        operationService.history(account);
        Assert.assertNotNull(account.getOperations());

    }
}
