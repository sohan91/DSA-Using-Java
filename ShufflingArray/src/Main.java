import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int[] nums = {2,5,1,3,4,7};//x1=2,x2=5,x3=1,y1=3,y2=4,y3=7
       int n = 3;
      int[] arr=  shuffle(nums,n);
      System.out.println(Arrays.toString(arr));
    }
    public static  int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        for(int i = 0;i<n;i++)
        {
            arr[2*i] = nums[i];
            arr[2*i+1] = nums[i+n];
        }
        return arr;
    }
}
