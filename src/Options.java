import java.util.Scanner;

public class Options {
    public  static  void options () {
        System.out.println("Select the options: ");
        int type1 = 1;
        int type2 = 2;
        int type3 = 3;
        System.out.print("Type - " + type1 + " - Checking account");
        System.out.print("Type - " + type2 + " - Saving account");
        System.out.print("Type - " + type3 + " - Exit");

        Scanner choice = new Scanner(System.in);
        int choices = choice.nextInt();
        switch(choices) {
            case 1:
                System.out.print("Checking Account: ");
                System.out.print("Type 1 - View Balance");
                System.out.print("Type 2 - Withdraw Funds");
                System.out.print("Type 3 - Deposit Funds");
                System.out.print("Type 4 - Exit");
        }
    }
}
