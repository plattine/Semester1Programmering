package OwnExercises;
//UNFINISHED
import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount account01 = new BankAccount("Alice", 1200);
        BankAccount account02 = new BankAccount("Bob", 700);

        Scanner choiceInput = new Scanner(System.in);
        System.out.println("Deposit, withdraw or transfer? ");
        String choice = choiceInput.nextLine();

        Scanner amountInput = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double amount = amountInput.nextDouble();

        if (choice.equals("deposit")) {
            account01.depositAmount(amount);
            System.out.println(account01);
        }
        if (choice.equals("withdraw")) {
            account01.withdrawAmount(amount);
            System.out.println(account01);
        }
        if (choice.equals("transfer")) {
            account01.transferTo(account01.balance, amount);
            System.out.println(account01);
        }







    }
}
