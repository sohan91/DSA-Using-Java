import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int i;
        int j=0;
        int[][] array={
                {1,2,3,1},
                {1,5,4,},
                {4,2,5,4,6,8},
        };
        //if the array colum size is flectuate, then we use these method
        for( i = 0;i<array.length;i++)
        {
            for( j =0;j<array[i].length;j++)
            {
                System.out.print(array[i][j]+" ");

            }
            System.out.println(" ");

        }

    }
}
