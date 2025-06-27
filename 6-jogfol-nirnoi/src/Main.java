import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1, num2 = 0, sum;
        for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                num1 = a % 10;
                num2 = a;
                while(num2 >= 10) {
                    num2 = num2 / 10;
                }
                sum = num1 + num2;
            System.out.println("Sum = " + sum);
        }

    }
}