import java.util.*;

class Merge {

    // Divide and Merge
    public static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        List<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mS(int[] arr, int low, int high) {
        if (low == high) return;
        int mid = (low + high) / 2;
        mS(arr, low, mid);
        mS(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String args[]) {
        int[] arr = { 8, 7, 2, 1, 3 };
        mS(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
