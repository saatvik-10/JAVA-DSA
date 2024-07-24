import java.util.*;

class Functions {

    // 1) GCD of two numbers...
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = findGCD(a, b);

        System.out.println("The GCD is " + gcd);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }
        return a;
    }

    // 2) FIBONACCI SERIES...
    public static int fS(int n) {
        int a = 0;
        int b = 1;
        int count = 0;

        while (count < n) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
            count++;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        fS(n);
    }
}
