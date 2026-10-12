/*7. Create a custom unchecked exception named InsufficientBalanceException by extending
RuntimeException. Implement a BankAccount class with deposit() and withdraw() methods. Reject negative
deposits, non-positive withdrawals, and withdrawals exceeding the available balance. Handle exceptions in
main() and ensure the balance remains unchanged after failed transactions.

*/


class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    public void withdraw(double amount, double balance) {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance");
        }

        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Amount must be positive");
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + balance);
    }

    public void deposit(double amount, double balance) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Deposit amount must be positive");
        }

        balance = balance + amount;
        System.out.println("Deposit successful");
        System.out.println("Updated balance: " + balance);
    }
}

class Exception6 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        double balance = 1200;
        double amount = 1500;

        try {
            b.withdraw(amount, balance);
            System.out.println("Valid balance");
        }
        catch (InsufficientBalanceException i) {
            System.out.println("Exception: " + i.getMessage());
        }
        catch (IllegalArgumentException i) {
            System.out.println("Exception: " + i.getMessage());
        }
    }
}
