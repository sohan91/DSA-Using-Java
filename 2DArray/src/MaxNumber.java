import java.util.Arrays;

public class MaxNumber {
    public static void main(String[] args) {
        int[][] arr = {
                {19, 23, 20, 1},
                {2, 21, 394, 120},
                {12, 342, 235, 423,1000},
        };

        System.out.println("Max Number is "+getMax(arr));
        System.out.println("Minimum number is "+getMin(arr));
    }
    public static int getMax(int[][] arr )
    {
        int max = arr[0][0];
        for(int i = 0;i<arr.length;i++)
        {
            for (int j =0;j<arr[i].length;j++)
            {
                if(arr[i][j]>max)
                {
                    max = arr[i][j];
                }
//                System.out.println(new int[]{i,j});
            }
            
        }

        return  max;
    }
    public static int getMin(int[][] array)
    {
        int min = array[0][0];
        for(int i = 0;i<array.length;i++)
        {
            for (int j =0;j<array[i].length;j++)
            {
                if(array[i][j]<=min)
                {
                    min = array[i][j];
                }
            }
        }
        return min;
    }
}
