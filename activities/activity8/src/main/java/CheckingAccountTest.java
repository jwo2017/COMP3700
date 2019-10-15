import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CheckingAccountTest {
    @Test
    public void test_deposit() {
        CheckingAccount testAccount;
        testAccount = new CheckingAccount("John", 12.0);
        testAccount.deposit(23.0);
        assertEquals(testAccount.getBalance(), 35.0, .000001);
    }
    @Test
    public void test_withdraw() {
        CheckingAccount testAccount = new CheckingAccount("John", 12.0);
        testAccount.withdraw(5.0);
        assertEquals(testAccount.getBalance(), 7.0, .000001);
        testAccount.withdraw(8.0);
        assertEquals(testAccount.getmTotalFee(), 35.0, .000001);
    }

}