public class MissingNumber_Amazon {
    public static void main(String[] args) {
        int[] array = {9,6,4,2,3,5,7,0,1};
        System.out.println("missing element is "+missingNumber(array));

    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length)
        {
            int correct = nums[i];
            if (nums[i] < nums.length && correct != nums[correct])
            {
               swap(nums, i, correct);
            }
            else
            {
                i++;
            }
        }
        //searching for the missing element
        for(int index = 0;index< nums.length;index++)
        {
            if(nums[index]!=index)
            {
                return index;
            }
        }
        return nums.length;
    }
        static void swap(int[] arr,int start,int end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

}
