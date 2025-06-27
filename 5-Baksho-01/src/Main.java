import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int temp = 0;
            int breakCount = 0;
            while(true) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                    temp++;
                }
                if(temp == n) {
                    System.out.println();
                    temp = 0;
                }
                breakCount++;
                if (breakCount == n) {
                    System.out.println();
                    break;
                }

            }
        }
    }
}