import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {0};
        bubbleSort(arr,0,1,arr.length-1);
        System.out.println("Sort : "+ Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr,int i, int j,int len)
    {

        if(i<len) {
           if(j <=len) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    bubbleSort(arr, i, j + 1, len);
                }
                bubbleSort(arr, i, j + 1, len);
            }
            bubbleSort(arr, i + 1, 1, len);
        }
    }
}
