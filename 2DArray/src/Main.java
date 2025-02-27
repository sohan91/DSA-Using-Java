import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of numbers : ");
        int rows =sc.nextInt();
        System.out.print("Enter number of coloms : ");
        int coloms = sc.nextInt();
        int[][] array = new int[rows][coloms];
        for(int i = 0;i<rows;i++)
        {
            for(int j=0;j<coloms;j++)
            {
               array[i][j]=sc.nextInt();
            }
        }
        for(int i = 0;i<rows;i++)
        {
//            for(int j=0;j<coloms;j++)
//            {
//                System.out.print(array[i][j]+" ");
//            }
//            System.out.print("\n");
            System.out.println(Arrays.toString(array[i]));
        }

    }
}
