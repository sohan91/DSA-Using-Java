import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49}
        };
        int target = 35;
System.out.println(Arrays.toString(getTarget(arr,target)));
    }
    public  static  int[] getTarget(int[][] arr,int target)
    {
        int row = 0;
        int col = arr.length;
        while(row < arr.length && col >= 0)
        {
            if(arr[row][col] == target)
            {
                return new int[]{row,col};
            }
            if(arr[row][col] < target)
            {
                row++;
            }
            else {
                col--;
            }
        }
return new int[]{-1,-1};
    }
}
