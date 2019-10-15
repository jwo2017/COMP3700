import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SavingsAccountTest {
    @Test
    public void test_deposit() {
        SavingsAccount testAccount;
        testAccount = new SavingsAccount("John", 12.0);
        testAccount.deposit(23.0);
        assertEquals(testAccount.getBalance(), 35.0, .000001);
    }
    @Test
    public void test_withdraw() {
        SavingsAccount testAccount = new SavingsAccount("John", 50.0);
        testAccount.withdraw(5.0);
        assertEquals(testAccount.getBalance(), 45.0, .000001);
        testAccount.withdraw(10.0);
        assertEquals(testAccount.getBalance(), 35.0, .000001);
        testAccount.withdraw(3);
        testAccount.withdraw(3);
        testAccount.withdraw(3);
        testAccount.withdraw(3);
        testAccount.withdraw(3);
        testAccount.withdraw(3);
        assertEquals(testAccount.getBalance(), 23.0, .000001);

    }

}