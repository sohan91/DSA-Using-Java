import javax.swing.*;
import java.awt.print.Paper;

public class NQueensProblem {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] booleans = new boolean[n][n];
        System.out.println(queen(booleans,0));
    }

    public static int queen(boolean[][] board,int row)
    {
        if(row == board.length)
        {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,row,col))
            {
                board[row][col] = true;
                count += queen(board,row+1);
                board[row][col] =false;
            }

        }
        return count;


    }

    public static boolean isSafe(boolean[][] board,int row,int col)
    {
        for(int i = 0;i<row;i++)
        {
            if(board[i][col])
            {
                return false;
            }
        }
        //diagonal left
        int maxLeft = Math.min(row,col);
        for(int i = 1;i<=maxLeft;i++)
        {
            if(board[row-i][col-i])
            {
                return false;
            }
        }

        //diagonal right
        int maxRight = Math.min(row,board.length-col-1);
        for(int i = 1;i<=maxRight;i++)
        {
            if(board[row-i][col+i])
            {
                return false;
            }
        }

        return true;

    }


    public static void display(boolean[][] booleans)
    {
        for(boolean[] row:booleans)
        {
            for(boolean col : row)
            {
                if(col)
                {
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}
