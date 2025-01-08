import java.util.Scanner;

public class SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :");
        int numbers = in.nextInt();
        int count = 0;
        int N = 2;
        while (count < numbers) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i ++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(N + " ");
                count++;
            }
            N++;
        }
    }
}
