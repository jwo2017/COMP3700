public class Account {
    private double mBalance = 0;
    private double mTotalFee = 0;
    private String mOwner;

    public Account(String owner, double balance) {
        mBalance = balance;
        mOwner = owner;
    }


    public double getBalance() {
        return mBalance;
    }

    public String getOwner() {
        return mOwner;
    }

    public double getmTotalFee() {
        return mTotalFee;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("A negative amount is not allowed");
        } else {
            mBalance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("A negative amount is not allowed");
        }
        else {
            mBalance -= amount;
        }

    }

    public void addFees(double fee) {
        mTotalFee += fee;

    }
}