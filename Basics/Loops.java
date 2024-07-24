import java.util.*;

class Loops {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int table = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * n);
        }
    }
}
