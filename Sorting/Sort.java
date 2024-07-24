class Sort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 7, 8, 3, 1, 2 };
        //1) Bubble Sort
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            printArr(arr);
        }

        //2) Selection Sort
            for (int i = 0; i < arr.length - 1; i++) {
                int sm = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[sm] > arr[j]) {
                        sm = j;
                    }
                }
                int temp = arr[sm];
                arr[sm] = arr[i];
                arr[i] = temp;
            }
            printArr(arr);
        }

        //3) Insertion Sort
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && curr < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }
        printArr(arr);
    }
}
