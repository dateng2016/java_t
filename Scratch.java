public class Scratch {
    public static void main(String[] args) {

        int[] arr = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 }; // bubbleSort(arr);
        selectionSort(arr);
        printArr(arr);
        methods();
    }

    static void methods() {
        methods();
    }

    static void insertionSort(int[] arr) {

    }

    static void selectionSort(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < l; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    static void bubbleSort(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            boolean swapped = false;
            for (int j = 0; j < l - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
        }
    }

    static void printArr(int[] arr) {
        // 3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
