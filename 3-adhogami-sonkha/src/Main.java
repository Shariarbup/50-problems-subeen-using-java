public class Main {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1000; i >= 1; i--) {
            System.out.print(i + "\t");
            n++;
            if(n==5) {
                System.out.println();
                n = 0;
            }
        }
    }
}