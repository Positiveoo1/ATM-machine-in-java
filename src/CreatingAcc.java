import java.util.Scanner;

public class CreatingAcc {
    public static void creatingacc() {
        Scanner scanner = new Scanner(System.in);

        String AccNumber;
        String passwordNUmber;

        while(true) {
            System.out.println("Enter 8 digits of your account number: ");
            AccNumber = scanner.nextLine();

            if(AccNumber.length() != 8 ) {
                System.out.println("Entered incorrect length of numbers!");
            }else {
                break;
            }
        }

        while (true) {
            System.out.println("Enter 4 digits of your password: ");
            passwordNUmber = scanner.nextLine();

            if(passwordNUmber.length() != 4) {
                System.out.println("Entered incorrect length of password numbers!");
            }else {
                break;

            }
        }
        System.out.println("You have entered to your account successfully!");
    }

}
