import java.util.Scanner;
public class ATMInterface 
{
private static double balance = 1000; // Initial balance
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while(!exit) 
        {
            System.out.println("ATM Interface");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
        scanner.close();
    }

    private static void checkBalance() 
    {
        System.out.println("Your current balance is: $" + balance);
    }

    private static void deposit(double amount) 
    {
        if (amount <= 0) 
        {
            System.out.println("Invalid amount. Deposit failed.");
        } 
        else 
        {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        }
    }

    private static void withdraw(double amount) 
    {
        if (amount <= 0 || amount > balance) 
        {
            System.out.println("Invalid amount or insufficient balance. Withdrawal failed.");
        } 
        else 
        {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        }
    }
}
