import java.util.Arrays;

public class BackTrackForTheAllPossibleDirection {
    public static void main(String[] args) {
        int end = 3;
        boolean[][] booleans = {
                {false,false,false},
                {false,false,false},
                {false,false,false}};
             allDirectionPath(booleans,"",0,0,end);
    }
    public static void allDirectionPath(boolean[][] arr,String name,int row,int col,int end) {
        if (row == end-1 && col == end-1) {
            arr[row][col] = true;
            System.out.println("Path: " + name + " | Reached Index: (" + row + ", " + col + ")");
            for(int i = 0; i < end; i++) {
                System.out.print("{");
                for(int j = 0; j < end; j++) {
                    System.out.print(arr[i][j] + ",");
                }
                System.out.print("}");
                System.out.println();
            }
            return;
        }


        if ((arr[row][col])) {
            return;
        }
        arr[row][col] = true;
        if (row < end-1) {
            allDirectionPath(arr, name + "D", row+1, col, end);
        }
        if (col < end-1 && row<end-1) {
            allDirectionPath(arr, name + "R", row, col+1, end);
        }
        if (row >0) {
            allDirectionPath(arr, name + "U", row - 1, col, end);
        }
        if (col>0) {
            allDirectionPath(arr, name + "L", row , col-1, end);
        }
        arr[row][col] = false;
    }
}
