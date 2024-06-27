public class quickSort {

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1; // Index to track elements less that pivot
        for (int j = low; j < high ; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; // pivot index
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 6, 8, 7, 4, 3, 2, 5 };

        int n = arr.length;

        quickSort(arr, 0, n - 1);

        // Print array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// public class quickSort {

// public static int partition(int arr[], int low, int high) {
// int pivot = arr[high];
// int i = low - 1;

// for (int j = low; j < high; j++) {
// if (arr[j] < pivot) {
// i++;
// // swap
// int temp = arr[i];
// arr[i] = arr[j];
// arr[j] = temp;

// }
// }
// // Placing pivot to its correct position
// i++;
// int temp = arr[i];
// arr[i] = pivot;
// arr[high] = temp;
// return i; // Pivot index

// }

// public static void quickSort(int arr[], int low, int high) {
// if (low < high) {
// int pivotIndex = partition(arr, low, high);
// quickSort(arr, low, pivotIndex - 1);
// quickSort(arr, pivotIndex + 1, high);
// }
// }

// public static void main(String[] args) {
// int arr[] = { 9, 8, 6, 7, 2, 3, 5, 4 };
// int n = arr.length;

// quickSort(arr, 0, n - 1);

// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }
// }