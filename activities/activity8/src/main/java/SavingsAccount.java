public class SavingsAccount extends Account {

    private int withdraws = 0;
    public SavingsAccount(String name, double balance) {
        super(name, balance);
        withdraws = 0;
    }


    public static int MAX_WITHDRAW = 6;
    public static double FEE_WAIVER_COND = 100.0;
    public static double FEE = 5.0;

    public void withdraw(double amount) {
        if (amount <= 0|| amount >= getBalance()) {
            System.out.println("A negative amount is not allowed");
        }
        else if (withdraws < 6) {
            super.withdraw(amount);
            withdraws++;
        }
        else {
            System.out.println("Max withdraws for the month has been reached.");
        }
    }

    public void calculateFees() {
        if(super.getBalance() <= FEE_WAIVER_COND) {
            super.addFees(FEE);
        }
    }
}