import java.util.ArrayList;
import java.util.List;

public class NQueensProblem {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(nQueen(num));
    }
    public static List<List<String>> nQueen(int size)
    {
        List<List<String>> list = new ArrayList<>();
        char[][] charArray = new char[size][size];
        nQueensProblem(charArray,list,0,size);
        return list;

    }

    public static void nQueensProblem(char[][] charArray,List<List<String>> list,int row,int size)
    {

        if(row == size)
        {

            display(charArray,list);
            return;
        }
        for(int col = 0;col<size;col++) {
            if (isPositioned(charArray, row, col, size)) {
                charArray[row][col] = 'Q';

                nQueensProblem(charArray, list, row + 1, size);
                charArray[row][col] = '.';
            }
        }
    }

    public static boolean isPositioned(char[][] charArray,int row,int col,int size)
    {
        for(int i = 0;i<size;i++)
        {
            if(charArray[row][i] == 'Q')
            {
                return false;
            }
        }

        for (int i = 0;i<size;i++)
        {
            if(charArray[i][col] == 'Q')
            {
                return false;
            }
        }

        for(int i = row,j = col;i>=0 && j>=0;i--,j--)
        {
            if(charArray[i][j] == 'Q')
            {
                return false;
            }
        }

        for(int i = row,j = col;i>=0 && j<size;i--,j++)
        {
            if(charArray[i][j] == 'Q')
            {
                return false;
            }
        }
        return true;
    }

    public static void   display(char[][] arr,List<List<String>> list)
    {
        String row = "";
        List<String> rowList = new ArrayList<>();
        for(int i = 0;i<arr.length;i++) {
            row = "";
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }

            rowList.add(row);
        }
        list.add(rowList);

     //   System.out.println("possible ways of placing a queen is "+count);
    }

}
