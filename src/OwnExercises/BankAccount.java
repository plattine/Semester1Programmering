//UNFINISHED
package OwnExercises;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public double depositAmount(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            return balance;
        } else {
            return balance;
        }
    }

    public double withdrawAmount(double amount) {
        if (amount < 0) {
            return balance;
        }
        if (amount > balance) {
            return balance;
        } else {
            balance = balance - amount;
            return balance;

        }
    }

    public double transferTo(BankAccount, double amount) {

    }

    @Override
    public String toString() {
        return owner + ": " + balance + " €";
    }
}



