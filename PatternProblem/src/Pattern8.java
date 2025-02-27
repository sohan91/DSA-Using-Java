import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and coloms : ");
        int rows = sc.nextInt();
         // You can change this to any number of rows you want
         for(int i = 1;i<=rows;i++)
         {
             for(int j = 1;j<=rows-i;j++)
             {
                 System.out.print(" ");
             }
             for(int k = 1;k<=2 * i-1;k++)
             {
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}
