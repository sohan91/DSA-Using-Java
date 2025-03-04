import java.util.Arrays;

class QuickSortAscendingOrder {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low>=high)
        {
            return;
        }
        int i = low;
        int j = high;
        int mid = low + (high - low) / 2;
        int pivot = arr[mid];
            while (i <= j) {
            while (i <= j && arr[i] < pivot) {
                i++;
            }
            while (i <= j && arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
            quickSort(arr, i, high);
            quickSort(arr,low,j);

    }

    // Helper method to swap two elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}