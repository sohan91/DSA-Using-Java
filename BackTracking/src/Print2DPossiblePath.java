import java.util.Arrays;

public class Print2DPossiblePath {
    public static void main(String[] args) {
        boolean[][] booleans = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
                {true,true,true}};

        int[][] arr = new int[booleans.length][booleans[0].length];
        printMatrix(booleans,arr,0,0,"",1);
    }

    public static void printMatrix(boolean[][] booleans,int[][] arr,int i,int j,String name,int count)
    {
        if(i == booleans.length-1 && j == booleans[0].length-1)
        {
            arr[i][j] = count;
            for(int[] arr1: arr) {
                System.out.println(Arrays.toString(arr1));
            }
            System.out.println(name);
            return;
        }

        if(!(booleans[i][j]))
        {
            return;
        }
        booleans[i][j] = false;
        arr[i][j] = count;
        if(i<booleans.length-1)
        {
            printMatrix(booleans,arr,i+1,j,name+"D",count+1);
        }
        if(j<booleans[0].length-1)
        {
            printMatrix(booleans,arr,i,j+1,name+"R",count+1);
        }
        if(i>0)
        {
            printMatrix(booleans,arr,i-1,j,name+"U",count+1);
        }
        if(j>0)
        {
            printMatrix(booleans,arr,i,j-1,name+"L",count+1);
        }

        booleans[i][j] = true;
        arr[i][j] = 0;
    }
}
