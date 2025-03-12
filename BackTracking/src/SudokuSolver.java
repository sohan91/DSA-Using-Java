import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SudokuSolver {
    public static void main(String[] args) {
      char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(sudokuList(board,0,0,board.length));
        for(char[] ch : board)
        {
            for (char c : ch)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }

    public static boolean sudokuList(char[][] board,int row,int col,int size)
    {
        if(row == 9)
        {
            return true;
        }
        int nextRow = row;
        int nextCol = col+1;
        if(nextCol == 9)
        {
            nextRow = row+1;
            nextCol = 0;
        }
       if(board[row][col] != '.')
       {
           return sudokuList(board,nextRow,nextCol,size);
       }

       for(char digit= '1';digit<='9';digit++)
       {
           if(isSafe(board,row,col,digit))
           {
               board[row][col] = digit;
               if(sudokuList(board,row,col,size))
               {
                   return true;
               }
               board[row][col] = '.';
           }
       }
       return false;
    }

    public static boolean isSafe(char[][] arr,int row,int col,int num)
    {
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[row][i] == num)
            {
                return false;
            }
        }

        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i][col] == num)
            {
                return false;
            }
        }
        //for Grid Checking
      int rowIndexStart = ((row/3)*3);
        int  colIndexStart = ((col/3)*3);
        for(int i = rowIndexStart;i<=rowIndexStart+2;i++)
        {
            for(int j = colIndexStart;j<=colIndexStart+2;j++)
            {
                if(arr[i][j] == num)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
