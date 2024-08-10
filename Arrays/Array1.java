class Array1 {

    // 1) LARGEST NUMBER IN AN ARRAY
    public static void main(String args[]) {
        int[] arr = { 3, 2, 1, 5, 20 };
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                System.out.println(largest);
            }
        }
    }

    // 2) SECOND LARGET NUMBER IN AN ARRAY
    public static void main(String args[]) {
        int[] arr = { 3, 2, 1, 5, 4 };
        int largest = arr[0];
        int slargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        System.out.println(slargest);
    }

    // 3) CHECK IF THE ARRAY IS SORTED
    public static void main(String args[]) {
        int[] arr = { 1, 3, 2, 5, 4 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[i + 1]) {} else {
                return false;
            }
        }
        return true;
    }

    // 4) REMOVE DUPLICATES
    public static void main(String args[]) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3 };
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        System.out.println(i + 1);
    }
}
