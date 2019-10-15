import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AccountTest {
    @Test
    public void test_deposit() {
        Account testAccount = new Account("John", 12.0);
        testAccount.deposit(23.0);
        assertEquals(testAccount.getBalance(), 35.0, .000001);
    }
    @Test
    public void test_withdraw() {
        Account testAccount = new Account("John", 12.0);
        testAccount.withdraw(5.0);
        assertEquals(testAccount.getBalance(), 7.0, .000001);
    }

}