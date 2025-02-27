import java.util.Arrays;

public class QuickSortAscendingOrder {
    public static void main(String[] args) {
        int[] arr = {3, 99, 2, 4, 22, 4};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = findPivotNumber(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int findPivotNumber(int[] arr, int low, int high) {
        int pivot = arr[low];
        int firstIndex = low + 1;
        int lastIndex = high;

        while (firstIndex <= lastIndex) {
            while (firstIndex <= lastIndex && arr[firstIndex] <= pivot) {
                firstIndex++;
            }
            while (firstIndex <= lastIndex && arr[lastIndex] >= pivot) {
                lastIndex--;
            }

            if (firstIndex < lastIndex) {
                swap(arr, firstIndex, lastIndex);
            }
        }
        swap(arr, low, lastIndex);
        return lastIndex;
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
