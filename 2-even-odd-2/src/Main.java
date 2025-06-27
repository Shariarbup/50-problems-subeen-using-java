import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            String bigIntSting = sc.next();
            BigInteger bigInt = new BigInteger(bigIntSting);
            if(bigInt.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }

    }
}