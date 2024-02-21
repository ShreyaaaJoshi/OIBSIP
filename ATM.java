import java.util.Scanner;

public class ATM {
    private double balance;
    private Scanner scanner;

    public ATM(double initialBalance) {
        balance = initialBalance;
        scanner = new Scanner(System.in);
    }

    public void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }

    public void deposit() {
        System.out.print("Enter deposit amount: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount entered.");
        }
    }

    public void withdraw() {
        System.out.print("Enter withdrawal amount: $");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Invalid amount entered or insufficient funds.");
        }
    }

    public void close() {
        scanner.close();
    }

    public static void main(String[] args) {
        ATM atm = new ATM(1000); // Initial balance $1000
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    atm.deposit();
                    break;
                case 3:
                    atm.withdraw();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        atm.close();
        scanner.close();
    }
}
