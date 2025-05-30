public class ArrayPartition {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choose the last element as the pivot
        int i = low - 1;  // Initialize the index of the smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                // Swap arr[i+1] and arr[j]
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] to place the pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // Return the index of the pivot
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9, 3};
        int n = arr.length;

        int pivotIndex = partition(arr, 0, n - 1);

        System.out.println("Array after partition:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("\nPivot index: " + pivotIndex);
    }
}
