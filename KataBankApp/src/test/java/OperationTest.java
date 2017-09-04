import fr.katabankapp.entities.Operation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

/**
 * Test for Operation class
 * @author Haythem
 */
public class OperationTest {

    /**
     * Instance of operation
     * @see Operation
     */
    private Operation operation;

    @Before //testing the operation creation
    public void beforeTestingOperation(){
        operation= new Operation();

        Assert.assertNotNull(operation);
    }


    @Test //testing operation attributes
    public void testOperation(){
        operation.setAmount(100);
        operation.setBalance(50);
        operation.setDate(LocalDate.now());
        operation.setNumOperation(1);
        operation.setType(Operation.TypeOperation.deposit);

        Assert.assertEquals(100,operation.getAmount(),0);
    }

}
