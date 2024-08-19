import java.util.Scanner;

public class CreatingAcc {
    public  static void creatingacc() {
        Scanner accountNumber = new Scanner(System.in);

        System.out.println("Enter 8 digits of your account Number: ");
        int numbers = accountNumber.nextInt();
        Scanner password = new Scanner(System.in);
        System.out.println("Set 4 digits of password");
        int passwords = password.nextInt();
    }

}
