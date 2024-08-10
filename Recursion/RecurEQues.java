import java.util.*;

class RecurEQues {

    //1) Value from 5 to 1
    // public static void printNum(int n) {
    //     if (n == 0) {
    //         return;
    //     }
    //     System.out.println(n);
    //     printNum(n - 1);
    // }
    //
    // public static void main(String args[]) {
    // int n = 5;
    // printNum(n);
    // }
    // }

    // 2) Sum of n numbers
    // public static void printSum(int i, int n, int sum) {
    //     if (i == n) {
    //         sum += i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum += i;
    //     printSum(i + 1, n, sum);
    // }

    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     printSum(1, n, 0);
    // }
    // }

    // 3) Factorial of a num
    // public static int calcFact(int n) {
    //     if (n == 1 || n == 0) {
    //         return 1;
    //     }

    //     int fact_nm1 = calcFact(n - 1);
    //     int fact = n * fact_nm1;
    //     return fact;
    // }

    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     int ans = calcFact(n);

    //     System.out.println(ans);
    // }

    //4) Fibonacci Series
    // public static void fib(int a, int b, int n) {
    //     if (n == 0) {
    //         return;
    //     }

    //     int c = a + b;
    //     System.out.println(c);
    //     fib(b, c, n - 1);
    // }

    // public static void main(String args[]) {
    //     int a = 0;
    //     int b = 1;
    //     System.out.println(a);
    //     System.out.println(b);
    //     int n = 7;
    //     fib(a, b, n - 2);
    // }

    //5) Stack height x^n
    // public static int calcPower(int x, int n) {
    //     if (n == 0) {
    //         return 1;
    //     }

    //     if (x == 0) {
    //         return 0;
    //     }
    //     int xPNM1 = calcPower(x, n - 1);
    //     int xPN = x * xPNM1;
    //     return xPN;
    // }

    // public static void main(String args[]) {
    //     int x = 2, n = 5;
    //     int ans = calcPower(x, n);

    //     System.out.println(ans);
    // }

    //6) Stack height log(n)
    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else {
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }
    }

    public static void main(String args[]) {
        int x = 2, n = 3;
        int ans = calcPower(x, n);

        System.out.println(ans);
    }
}
