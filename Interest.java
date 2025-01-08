import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter month: ");
        month = input.nextInt();
        System.out.print("Enter interest rate: ");
        interestRate = input.nextDouble();
        System.out.print("Enter money: ");
        money = in.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
            System.out.println("Total interest is: " + totalInterest);
        }
    }
}
