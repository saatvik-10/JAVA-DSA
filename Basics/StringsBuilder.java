import java.util.*;

class StringsBuilder {

    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 's');
        System.out.println(sb);

        sb.insert(0, 'm');
        System.out.println(sb);

        sb.delete(1, 2); //end index is exclusive
        System.out.println(sb);

        sb.append('s');
        System.out.println(sb);

        // Reverse a string
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i; // 5-1-0 => 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
