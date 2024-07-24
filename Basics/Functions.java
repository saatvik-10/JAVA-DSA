import java.util.*;

class Functions {

    // Functions are called directly,,,
    // Methods are called through the objects of the class...

    public static void fact(int n) {
        if (n < 0) {
            System.out.println("Enter a positive integer");
            return;
        }

        int facto = 1;

        for (int i = n; i >= 1; i--) {
            facto = facto * i;
        }
        System.out.println(facto);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fact(n);
    }
}
