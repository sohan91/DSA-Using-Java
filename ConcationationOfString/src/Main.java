import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num = {1,2,1};//should result {1,2,1,1,2,1}
        int[] lis = getArray(num);
        System.out.println(Arrays.toString(lis));
    }
    public static int[] getArray(int[] nums)
    {
                int n = nums.length;
                int value= 0;
                int[] ans = new int[n*2] ;
                for(int i=0;i<n;i++){

                    ans[i] = nums[i];
                    ans[i+n] = nums[i];
                }
                return ans;
    }
}
