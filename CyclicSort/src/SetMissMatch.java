import java.util.Arrays;

//the given problem should print the repeated number and duplicate number
public class SetMissMatch {
    public static void main(String[] args) {

        int[] array = {1,1};
       int[] n = findErrorNums(array);
       System.out.println(Arrays.toString(n));
    }

    public static int[] findErrorNums(int[] arr)
    {
        int repeatNumber = getRepeatNumber(arr);
        int duplicate = getDuplicateNumber(arr);
        int[] ans = {repeatNumber,duplicate};
        return ans;
    }
    static int getRepeatNumber(int[] array)
    {
        int r = 0;
        int i = 0;
        while(i<array.length) {
            int correct = array[i] - 1;
            if (array[i] != array[correct]) {
                swap(array, i, correct);
            } else {
                i++;
            }
        }
            for (int index = 0;index<array.length;index++)
            {
                if(array[index]!=index+1)
                {
                  r =  array[index];
                }
            }
return r;
    }
    static int getDuplicateNumber(int[] nums)
    {int r = 0;
        int i = 0;
        while(i<nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0;index<nums.length;index++)
        {
            if(nums[index]!=index+1)
            {
                r =  index+1;
            }
        }
        return r;
    }
    static void swap(int[] a,int start,int end)
    {
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }
}
