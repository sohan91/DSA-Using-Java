import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,4,0,3,2,1,8};
        System.out.println("Given Array : "+ Arrays.toString(arr));
        sortedArray(arr,0,arr.length-1);
        System.out.println("Sorted array : "+ Arrays.toString(arr));
    }
    public static void sortedArray(int[] arr,int low, int hig) {
        if (low >= hig) {
            return;
        }
        int start = low;
        int end = hig;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];
        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }

            while (arr[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        sortedArray(arr,low,end);
        sortedArray(arr,start,hig);
    }

}
