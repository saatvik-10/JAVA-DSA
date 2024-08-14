import java.util.*;

class SubArray {

    public static void main(String args[]) {
        // 1) Longest subarray with sum k [+ve]
        int arr[] = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        //**BRUTE
        int s = 0;
        int k = 3;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                s += arr[j];
                if (s == k) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        System.out.println(res);
        return;

        //**BETTER
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            int rem = sum - k;
            if (map.find(rem) != map.end()) {
                int len = i - map[rem];
                maxLen = Math.max(maxLen, len);
            }
            if (map.find(sum) == map.end()) {
                map[sum] = i;
            }
        }
        System.out.println(maxLen);
    }
}
