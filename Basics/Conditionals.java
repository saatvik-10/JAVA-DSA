import java.util.*;

class Conditionals {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int calc = sc.nextInt();

        int sum = a + b;
        int diff = a - b;
        int multi = a * b;
        int div = a / b;

        switch (calc) {
            case 1:
                System.out.println(sum);
                break;
            case 2:
                System.out.println(diff);
                break;
            case 3:
                System.out.println(multi);
                break;
            case 4:
                System.out.println(div);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
