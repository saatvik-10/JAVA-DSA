class Backtrack {

    //1) All permutations of a string, Time Complexity => (n*n!)
    public static void printPermu(String str, String permu, int idx) {
        if (str.length() == 0) {
            System.out.println(permu);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermu(newStr, permu + curr, idx + 1);
        }
    }

    public static void main(String args[]) {
        String str = "ABC";
        printPermu(str, "", 0);
    }
}
