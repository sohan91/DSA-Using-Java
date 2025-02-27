import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter number of rows and coloms : ");
        int n = sc.nextInt();
        for(int i = 1;i<=(2*n)-1;i++) {
            if(i>n)
            {
                for(int col = 2*n-i;col>0;col--)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else {
                for(int j = 0;j<i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }
}
