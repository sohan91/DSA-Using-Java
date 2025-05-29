import java.util.ArrayList;
import java.util.List;

public class NQueensProblem {
    public static void main(String[] args) {
        int num = 4;
        char[][] board = new char[num][num];
        queen(board,0,num);
    }
    public static void queen(char[][] board,int row,int size)
    {
      if (row == size)
      {
          display(board);
          return;
      }

      for(int col = 0;col<size;col++)
      {
          if(isPositioned(board,row,col,size))
          {
              board[row][col] = 'Q';
              queen(board,row+1,size);
              board[row][col] = '.';
          }
      }
    }

    public static boolean isPositioned(char[][] arr,int row,int col,int size)
    {

        //check horizontal row
        for(int i = 0;i<size;i++)
        {
            if(arr[i][col] == 'Q')
            {
                return false;
            }
        }
        //check vertical colm
        for(int i = 0;i<size;i++)
        {
            if(arr[row][i] == 'Q')
            {
                return  false;
            }
        }

        //diagonal-top-left
        for(int i = row,j=col;i>=0 && j>=0; i--,j--)
        {
            if(arr[i][j] == 'Q')
            {
                return false;
            }
        }

        //diagonal-top-right
        for(int i = row,j=col;i>=0 && j<size; i--,j++)
        {
            if(arr[i][j] == 'Q')
            {
                return false;
            }
        }
        return true;

    }

    public static void display(char[][] arr)
    {
        String row = "";
        List<String> charList = new ArrayList<>();

        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<arr[0].length;j++)
            {
                if(arr[i][j] == 'Q')
                    System.out.print("Q ");
                else
                    System.out.print("x ");
            }
            System.out.println();
        }
        System.out.println();

    }

}