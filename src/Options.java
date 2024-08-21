import java.util.Scanner;

public class Options {
    public static void options() {
        Scanner choice = new Scanner(System.in);

        while (true) {
            int balance = 1000;

            baseOptions.basicOptions();
            int choices = choice.nextInt();
            switch (choices) {
                case 1:
                    System.out.println("Checking Account: ");
                    System.out.println("Type 1 - View Balance");
                    System.out.println("Type 2 - Withdraw Funds");
                    System.out.print("Type 3 - Deposit Funds \n");
                    System.out.println("Type 4 - Exit");

                    int checkingChoice = choice.nextInt();

                    switch (checkingChoice) {
                        case 1:
                            System.out.println("Your balance is : " + balance);
                            break;
                        case 2:
                            System.out.println("Enter the amount you want to withdraw: ");
                            int withdrawAmount = choice.nextInt();


                            if (balance >= withdrawAmount) {
                                balance -= withdrawAmount;

                                System.out.println("You have withdrawn successfully: " + withdrawAmount);
                                System.out.println("New balance is: " + balance);

                            } else {
                                System.out.println("Lack of amount!");
                            }
                            break;

                        case 3:
                            System.out.println("Enter the amount you want to deposit: ");
                            int depositAmount = choice.nextInt();
                            balance += depositAmount;
                            System.out.println("You have deposited: " + depositAmount);
                            System.out.println("New balance is: " + balance);
                            break;
                        case 4:
                            System.out.println("Exiting checking account menu.");
                            break;
                        default:
                            System.out.println("Invalid option. Please try again.");
                    }
            }
        }


    }
}
