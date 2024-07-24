import java.util.*;

class Arrays {

    public static void main(String args[]) {
        int[] marks = new int[3];

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        //input
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        //we can also write int marks[] = {10,20,30};

        //output
        for (int i = 0; i < size; i++) {
            System.out.println(num[i]);
        }

        // --------------------------------------------

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        //input
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for (int i = 0; i < num.length; i++) {
            if (num[i] == x) {
                System.out.println("x found at index: " + i);
            }
        }
    }
}
