import java.util.ArrayList;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int size = 5;
        int[] arr = {3,5,3,2,1};
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<size;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("Max: "+max);
        int newSize = max+1;
       int[] freqArray = new int[newSize];
       int index = 0;
       while(index<newSize) {
           int freq = 0;
           for (int j = 0; j < size; j++) {
               if (index == arr[j]) {
                   freq++;
               }
           }
           freqArray[index++] = freq;
       }
       int[] sortedArray = new int[size];
        int i = 0;
        int k = 0;
       while(i<newSize)
       {
           if(freqArray[i] != 0)
           {
               for(int j = 0; j < freqArray[i]; j++) {
                   sortedArray[k++] = i;
               }
           }
           i++;
       }
        System.out.println("Sorted is: "+ Arrays.toString(sortedArray));
    
    }
}
