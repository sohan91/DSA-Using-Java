import java.util.Arrays;

public class QuickSortDescendingOrder {
    public static void main(String[] args) {
        int[] arr = {9,20,73,22,22};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int low, int high)
    {
        if(arr.length == 1)
        {
            return;
        }
        if(low<high) {
            int pivotIndex = pivotNum(arr, low, high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }

    public static int pivotNum(int[] arr,int low,int high)
    {

        int pivot = arr[low];
        int leftIndex = low;
        int rightIndex = high;
        while(leftIndex <= rightIndex)
        {
            while(arr[leftIndex]>pivot)
            {
                leftIndex++;
            }
            while (arr[rightIndex]>pivot)
            {
                rightIndex--;
            }

            if(leftIndex<=rightIndex) {
                int temp = arr[leftIndex];
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
}