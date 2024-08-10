import java.util.*;

class RecurMQues {

    //1) Tower of Hanoi => Time Complexity - O(2^n-1)
    public static void TOH(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println(
                "Transfer Disk " + n + " from " + src + " to " + dest
            );
            return;
        }
        TOH(n - 1, src, dest, helper);
        System.out.println(
            "Transfer Disk " + n + " from " + src + " to " + dest
        );

        TOH(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 2;
        TOH(n, "S", "H", "D");
    // }

    //2) Reverse a String
    public static void printRev(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        printRev(str, idx - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        printRev(str, str.length() - 1);
    // }

    // 3) First and last occurance
    public static int first = -1;
    public static int last = -1;

    public static void occ(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currChar = str.charAt(idx);

        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        occ(str, idx + 1, element);
    }

    public static void main(String args[]) {
        String str = "abaacdaefaah";

        occ(str, 0, 'a');
    // }

    // 4) Check if array is sorted (asc)
    public static boolean sort(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] >= arr[idx + 1]) {
            return false;
        }
        return sort(arr, idx + 1);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(sort(arr, 0));
    // }

    // 5) Move 'x' at end of the string
    public static void moveALLX(String str, int idx, int count, String newStr) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        char curr = str.charAt(idx);
        if (curr == 'x') {
            count++;
            moveALLX(str, idx + 1, count, newStr);
        } else {
            newStr += curr;
            moveALLX(str, idx + 1, count, newStr);
        }
    }

    public static void main(String args[]) {
        String str = "axbcxxd";
        moveALLX(str, 0, 0, "");
    }

    // 6) Remove duplicate in a string
    public static boolean[] map = new boolean[26];

    public static void rem(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char curr = str.charAt(idx);

        if (map[curr - 'a']) {
            rem(str, idx + 1, newStr);
        } else {
            newStr += curr;
            map[curr - 'a'] = true;
            rem(str, idx + 1, newStr);
        }
    }

    public static void main(String args[]) {
        String str = "abbccda";
        rem(str, 0, "");
    }

    // 7) Print all subsequences of a string (IMPORTANT), Time Complexity => O(2^n)
    public static void sub(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char curr = str.charAt(idx);

        //to be
        sub(str, idx + 1, newStr + curr);

        //not to be
        sub(str, idx + 1, newStr);
    }

    public static void main(String args[abc]) {
        String str = "abc";
        sub(str, 0, "");
    }

    // 8) Print all unique subsequences of a string (IMPORTANT), Time Complexity =>
    public static void sub(
        String str,
        int idx,
        String newStr,
        HashSet<String> set
    ) {
        if (idx == str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char curr = str.charAt(idx);

        //to be
        sub(str, idx + 1, newStr + curr, set);

        //not to be
        sub(str, idx + 1, newStr, set);
    }

    public static void main(String args[]) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        sub(str, 0, "", set);
    }

    // 9) Print keypad combination, Time Complexity => O(4^n)
    public static String[] kP = {
        ".",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tu",
        "vwx",
        "yz",
    };

    public static void printCom(String str, int idx, String combo) {
        if (idx == str.length()) {
            System.out.println(combo);
            return;
        }

        char curr = str.charAt(idx);

        String mapping = kP[curr - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printCom(str, idx + 1, combo + mapping.charAt(i));
        }
    }

    public static void main(String args[]) {
        String str = "5";
        printCom(str, 0, "");
    }
}
