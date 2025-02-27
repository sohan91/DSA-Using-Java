// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main{
    public static void main(String[] args) {

        int[] array = {2,2,4,5};
        sortedArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortedArray(int[] nums)
    {
        int len = nums.length-1;
        for(int i = 0;i<len;i++)
        {
            for(int j = i+1;j>0;j--)//it cheks the previous element by these loops
            {
                if(nums[j]<nums[j-1])
                {
                    swap(nums,j,j-1);
                }
                else
                {
                    break;
                    /*
                    due to break.. if the array is sort of the left side then we no need to swap
                     the element..because, already the left side elements are got swap.
                     It heps in optimisation of solution
                     */
                }
            }
        }
    }
    public static void swap(int[] arr,int start,int end)
    {
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }
}
    
    