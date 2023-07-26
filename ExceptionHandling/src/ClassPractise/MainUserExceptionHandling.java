package ClassPractise;

class InsufficientFundsException extends Exception {
    private double amount;
 
    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }
 
    public double getAmount() {
        return amount;
    }
}

class BankAccount {
    private double balance;
 
    public BankAccount(double balance) {
        this.balance = balance;
    }
 
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(amount - balance);
        }
        balance -= amount;
    }
}


// Main Class
public class MainUserExceptionHandling {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        try {
            account.withdraw(1850.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Insufficient funds: You are short by " + e.getAmount());
        }
    }
}
