import java.util.*;

class Input {

    public static void main(String args[]) {
        //Input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); //next takes only one token while next line takes the whole...
        /*some other inputs are:-
          1) nextInt()
          2) nextFloat()
        */
        System.out.println(name);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println(sum);
    }
}
