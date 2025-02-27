import java.util.Arrays;

public class Searching {
    public static void main(String[] args) {
        int[][] arr = {
                {1,4,6},
                {2,24},
                {5,3,8,20,3},
        };
        int target = 8;
        int[] arr1= searching(arr,target);
        System.out.println(Arrays.toString(arr1));
    }
    public static int[] searching(int[][] arr,int target)
    {
        for(int i =0 ;i < arr.length;i++)
        {
            for (int j = 0;j<arr[i].length;j++) {
                if (target == arr[i][j])
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
