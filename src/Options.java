import java.util.Scanner;

public class Options {
    public static void options() {
        Scanner choice = new Scanner(System.in);

        while (true) {
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
                            int balance = 0;
                            System.out.println("Your balance is : " + balance);
                            break;
                        case 2:
                            int withdrawAmount = 0;
                            System.out.println("Enter the amount you want to withdraw:");
                            System.out.println("You withdrawed" + choice.nextInt());
                            break;
                    }
            }
        }


    }
}
