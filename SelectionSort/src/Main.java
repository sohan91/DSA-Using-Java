// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {

        int[] array = {-9,-100,293};
        sortedArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortedArray(int[] nums)
    {
        for(int i = 0;i<nums.length-1;i++)
        {
            int last = nums.length -i-1;//due to swap can be done from the last.So,the -i,is added..So,it decreases the no.of operation(-1) according to the size
            int index = largestIndexPosition(nums,0,last);//this method return the largest element index
            swapping(nums,index,last);//this method will swap the index position..according to their order
        }
    }
    public static int largestIndexPosition(int[] nums,int start,int end)//returns the max index
    {
        int max = start;//Initially,Assuming the first elememt is largest number 

        for(int i = start;i<=end;i++)
        {
            if(nums[max]<nums[i])
            {
                max = i;
            }
        }
        return max;
    }
    public static void swapping(int[] nums,int first,int second)
    {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}