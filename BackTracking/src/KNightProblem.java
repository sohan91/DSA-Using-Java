public class KNightProblem {
    public static void main(String[] args) {
//        int[][] arr = {
//                {0, 11, 16, 5, 20},
//                {17, 4, 19, 10, 15},
//                {12, 1, 8, 21, 6},
//                {3, 18, 23, 14, 9},
//                {24, 13, 2, 7, 22}};

        int[][] arr = {
                {0,3,6},
                {5,8,1},
                {2,7,4}
        };
        System.out.println(kNightPbm(arr));
    }
        public static boolean kNightPbm(int[][] board)
        {
            if(board[0][0]!=0)
            {
                return false;
            }
            return isKnight(board,0,0,0);
        }
    public static boolean isKnight(int[][] board, int row, int col, int num)
    {
        int size = board.length;
        int i,j;
        if(board[row][col] == size*size-1){
            return true;
        }
        //2-up 1-left
        i = row-2;
        j = col-1;
        if(i>=0 && j>=0 && board[i][j] == num+1)
        {
            return isKnight(board,i,j,num+1);
        }

        //2-up 1-right
        i = row-2;
        j = col+1;
        if(i>=0 && j<size && board[i][j] == num+1)
        {
            return isKnight(board,i,j,num+1);
        }

        //2-left 1-up
        i = row-1;
        j = col-2;
        if(i>=0 && j>=0 && board[i][j] == num+1)
        {
            return isKnight(board,i,j,num+1);
        }

        //2-left 1-down
        i = row+1;
        j = col-2;
        if(i<size && j>=0 && board[i][j] == num+1)
        {
            return isKnight(board,i,j,num+1);
        }

        //2-down 1-left
        i = row+2;
        j = col-1;
        if(i<size && j>=0 && board[i][j] == num+1)
        {
            return isKnight(board,i,j,num+1);
        }

        //2-down 1-right
        i = row+2;
        j = col+1;
        if(i<size && j<size && board[i][j] == num+1)
        {
            return isKnight(board,i,j,num+1);
        }

        //2-right 1-up
        i = row-1;
        j = col+2;
        if(i>=0 && j<size && board[i][j] == num+1)
        {
            return isKnight(board,i,j,num+1);
        }

        //2-right 1-down
        i = row+1;
        j = col+2;
        if(i<size && j<size && board[i][j] == num+1)
        {
            return isKnight(board,i,j,num+1);
        }
        return false;
    }

 }

