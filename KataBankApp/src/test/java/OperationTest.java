import fr.katabankapp.entities.Operation;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

/**
 * Test for Operation class
 * @author Haythem
 */
public class OperationTest {

    @Test
    public void testOperation(){
        // Create a user
        Operation operation= new Operation();
        operation.setAmount(100);
        operation.setBalance(50);
        operation.setDate(LocalDate.now());
        operation.setNumOperation(1);
        operation.setType(Operation.TypeOperation.deposit);


        Assert.assertEquals(100,operation.getAmount(),0);
    }

}
