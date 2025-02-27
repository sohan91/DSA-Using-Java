import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns : ");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            for(int j = n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
