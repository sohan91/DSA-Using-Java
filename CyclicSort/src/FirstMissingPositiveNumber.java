public class FirstMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr ={1,2,0};
         System.out.println(getElement(arr));
    }
    public  static  int getElement(int[] nums)
    {

        int i = 0;
        while (i<nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i]<=nums.length && nums[correct] != nums[i]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0;index<nums.length;index++)
        {
                if(nums[index]!=index+1)
                {
                    return index+1;
                }
        }
return nums.length+1;
    }
    static void swap(int[] a,int start,int end)
    {
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }
}
