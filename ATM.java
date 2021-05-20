import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        System.out.println("Welcome to AAA ATM, Enter your Card");

        Scanner input= new Scanner(System.in);

        System.out.print("\nenter your 4 Digit pin: ");
        int pin=input.nextInt();
        double Balance= 18273.45;

        System.out.println("""
                Press 1 for your Balance.
                Press 2 To make Withdraw.
                Press 3 To make pay in.
                Press 4 To take loan.
                Press 0 To get your card out.""");
        System.out.print("\nEnter the number of your choice: ");
        int choice =input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("\nYour balance is: " + Balance + "\n\nThank You for using AAA ATM. ");
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: ");
                double withdraw = input.nextDouble();
                double Balance_W = Balance - withdraw;
                System.out.println("\nYour Balance Before withdraw: " + Balance + "\nYour Balance After withdraw: " + Balance_W + "\n\nThank You for using AAA ATM.");
                break;
            case 3:
                System.out.print("Enter the amount to pay in: ");
                double pay_in = input.nextDouble();
                double Balance_in = Balance + pay_in;
                System.out.println("\nYour Balance Before pay in: " + Balance + "\nYour Balance After pay in: " + Balance_in + "\n\nThank You for using AAA ATM.");
                break;
            case 4:
                System.out.println("What is the loan amount you want: ");
                double loan = input.nextDouble();
                double Benefits = loan * 0.1;
                double All = loan + Benefits;
                System.out.println("Your loan is: " + loan + "\nThe benefit is: " + Benefits +
                        "The whole amount will be: " + All + "\n\nThank You for using AAA ATM. ");
                break;
            case 0:
                System.out.println("Thank You for using AAA ATM.");
                break;
        }

    }
}
