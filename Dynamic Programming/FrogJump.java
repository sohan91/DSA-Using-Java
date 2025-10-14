import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int[] arr = {30,10,60,10,60,50};
      //int res = jumpRec(0,arr);
        int[] dp = new int[arr.length+1];
        Arrays.fill(dp,-1);
        //int res = jumpMemoization(arr,dp,arr.length-1);
//        int res = jumpTabulation(arr,dp);
        int res = jumpOptimised(arr);
        System.out.println("Min energy taken is: "+res);
    }

    private static int jumpOptimised(int[] arr) {
         if(arr.length == 0 || arr.length == 1)
             return 0;
         int prev2 = 0;
         int prev1 =  Math.abs(arr[1] - arr[0]);
        //int[] arr = {30,10,60,10,60,30};
         for(int i = 2;i<arr.length;i++)
         {
             int l = prev1 + Math.abs(arr[i]-arr[i-1]);
             int r = prev2 + Math.abs(arr[i]-arr[i-2]);
             int current = Math.min(l,r);
             prev2 = prev1;
             prev1 = current;
         }
         return prev1;
    }

    private static int jumpTabulation(int[] arr, int[] dp) {
        if(arr.length == 0)
        {
            return 0;
        }
        if(arr.length == 1)
        {
            return arr[0];
        }
        dp[0] = arr[0];
        dp[1] = Math.abs(arr[1] -dp[0]);

        for(int i = 2;i<arr.length;i++)
        {
            int oneStep = dp[i - 1] + Math.abs(arr[i] - arr[i - 1]);//10+(60-10)=60
            int twoStep = dp[i - 2] + Math.abs(arr[i] - arr[i - 2]);//30+(50-30)=50
            dp[i] = Math.min(oneStep, twoStep);
        }
        return dp[arr.length-1];
    }

    private static int jumpMemoization(int[] arr, int[] dp, int index)
    {
        if(index == 0)
            return 0;

        if(dp[index] != -1)
        {
            return dp[index];
        }
        int l = jumpMemoization(arr,dp,index-1) + Math.abs(arr[index]-arr[index-1]);
        int right = Integer.MAX_VALUE;
        if(index>1) {
            right = jumpMemoization(arr,dp,index-2) + Math.abs(arr[index] - arr[index - 2]);
        }
        dp[index] = Math.min(l,right);
        return dp[index];
    }

    public  static int jumpRec(int index, int[] arr)
    {
        if(index == arr.length-1)
        {
            return 0;
        }
        int left = jumpRec(index+1,arr)+Math.abs(arr[index]-arr[index+1]);
        int min = Integer.MAX_VALUE;
        if(index<arr.length-2) {
             min = jumpRec(index + 2, arr) + Math.abs(arr[index] - arr[index + 2]);
        }
        return Math.min(left,min);
    }


}
