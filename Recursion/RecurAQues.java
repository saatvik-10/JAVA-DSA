import java.util.*;

class RecurAQues {

    /*// 1) Print permutations of a string, O(n!), Backtracking used
    public static void printPerm(String str, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            //abc => ab
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPerm(newStr, perm + curr);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        printPerm(str, "");
    }

    //2) Count the total paths in a maze to move from (0,0) to (n,m), Backtracking used
    public static int countPath(int i, int j, int m, int n) {
        if (i == m || j == n) {
            return 0;
        }

        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        // move down
        int downPath = countPath(i + 1, j, m, n);

        // move right
        int rightPath = countPath(i, j + 1, m, n);

        return downPath + rightPath;
    }

    public static void main(String args[]) {
        int m = 3, n = 3;
        int total = countPath(0, 0, m, n);
        System.out.println(total);
    }

    //3) Place tiles of size 1xm in a floor of size nxm
    public static int placeTile(int n, int m) {
        if (n == m) {
            return 2;
        }

        if (n < m) {
            return 1;
        }

        //vertical
        int vertPlace = placeTile(n - m, m);

        //horizontal
        int horPlace = placeTile(n - 1, m);

        return vertPlace + horPlace;
    }

    public static void main(String args[]) {
        int ans = placeTile(4, 2);
        System.out.println(ans);
    }

    //4) Find the number of ways in which you can invite n people to your party, single or in pairs
    public static int callGuest(int n) {
        if (n <= 1) {
            return 1;
        }

        //single
        int way1 = callGuest(n - 1);

        //pair
        int way2 = (n - 1) * callGuest(n - 2);

        return way1 + way2;
    }

    public static void main(String args[]) {
        int n = 4;
        System.out.println(callGuest(n));
    }*/

    //5) Print all the subsets of a set of all n natural numbers
    public static void printSub(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSub(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSub(subset);
            return;
        }

        //add
        subset.add(n);
        findSub(n - 1, subset);

        //subtract
        subset.remove(subset.size() - 1);
        findSub(n - 1, subset);
    }

    public static void main(String args[]) {
        int n = 4;
        ArrayList<Integer> subset = new ArrayList<>();
        findSub(n - 1, subset);
    }
}
