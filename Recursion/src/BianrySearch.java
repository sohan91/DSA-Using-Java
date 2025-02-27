public class BianrySearch {
    public static void main(String[] args) {
        int[] array = {3,4,8,37,54,83,84,100};
        int target =54;
        int ans = targetElement(array,0,array.length-1,target);
        System.out.println(ans);
    }
    public static int targetElement(int[] nums,int start,int end,int target)
    {
        if(start > end)
        {
            return -1;
        }
        int mid = start + (end - start)/2;
        if (target == nums[mid])
        {
            return mid;
        }
        else if(target < nums[mid])
        {
            return targetElement(nums,start,mid-1,target);
        }
        return targetElement(nums,mid+1,end,target);
    }

}
