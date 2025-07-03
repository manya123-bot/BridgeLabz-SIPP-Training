abstract class BankAccount {
    private String accountNumber, holderName;
    protected double balance;

    public BankAccount(String no, String name, double bal) {
        accountNumber = no;
        holderName = name;
        balance = bal;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt <= balance)
            balance -= amt;
    }

    public abstract double calculateInterest();

    public String getAccountInfo() {
        return holderName + "'s account #" + accountNumber;
    }
}

interface Loanable {
    void applyForLoan(double amount);

    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String no, String name, double bal) {
        super(no, name, bal);
    }

    public double calculateInterest() {
        return balance * 0.05;
    }

    public void applyForLoan(double amount) {
        /* Implementation */ }

    public double calculateLoanEligibility() {
        return balance * 0.8;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String no, String name, double bal) {
        super(no, name, bal);
    }

    public double calculateInterest() {
        return balance * 0.02;
    }

    public void applyForLoan(double amount) {
        /* Implementation */ }

    public double calculateLoanEligibility() {
        return balance * 0.5;
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
                new SavingsAccount("SA1", "Alice", 1000),
                new CurrentAccount("CA1", "Bob", 2000)
        };
        for (BankAccount acc : accounts) {
            System.out.println(acc.getAccountInfo() + " interest: $" + acc.calculateInterest());
        }
    }
}