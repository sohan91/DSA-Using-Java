import java.util.Arrays;

class QuickSortAscendingOrder{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int p = findPivotIndex(arr, start, end);
            quickSort(arr, start, p - 1);
            quickSort(arr, p + 1, end);
        }
    }

    public static int findPivotIndex(int[] arr, int low, int high) {
        int mid = low+(high-low)/2;
        int pivot = arr[low];  // Choose the first element as pivot
        int i = low + 1;       // Start `i` from `low + 1`
        int j = high;         // Start `j` from `high`

        while (i <= j) {
            // Move `i` to the right until an element greater than the pivot is found
            while (i <= j && arr[i] <= pivot) {
                i++;
            }
            // Move `j` to the left until an element less than the pivot is found
            while (i <= j && arr[j] >= pivot) {
                j--;
            }
            // Swap elements if `i` and `j` have not crossed
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap the pivot with `arr[j]` to place it in the correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        // Return the pivot index
        return j;
    }
}