import java.util.*;

class Quick {

    // Divide and Conquer
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void quick(int[] arr, int low, int high) {
        if (low < high) {
            int pI = partition(arr, low, high);
            quick(arr, low, pI - 1);
            quick(arr, pI + 1, high);
        }
    }

    public static void main(String args[]) {
        int[] arr = { 8, 7, 2, 1, 3 };
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
