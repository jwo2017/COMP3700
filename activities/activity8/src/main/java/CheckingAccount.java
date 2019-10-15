public class CheckingAccount extends Account {
    public CheckingAccount(String name, double balance) {
        super(name, balance);
    }

    private static double OVERDRAFT_FEE = 35.0;

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("A negative amount is not allowed");
        }
        else {
            super.withdraw(amount);

            if (super.getBalance() < 0) {
                super.addFees(OVERDRAFT_FEE);
            }
        }
    }
}