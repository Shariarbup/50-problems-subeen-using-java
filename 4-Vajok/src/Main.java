import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            System.out.print("Case "+ i + ":");
            for (int j = 1; j <= a; j++) {
                if(a % j == 0) {
                    System.out.print(" " + j);
                }
            }
            System.out.println();
        }
    }
}