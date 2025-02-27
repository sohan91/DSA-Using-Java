import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and colomns for pattern 9 : ");
        int row = sc.nextInt();
        for(int i = 1;i<=row;i++)
        {
            int forSpaces = row-i;
            for(int space = 0;space<forSpaces;space++)
            {
                System.out.print("  ");
            }
            for(int j = i;j>0;j--) {
                System.out.print(j+" ");
            }
            for(int next = 2;next<=i;next++)
            {
                System.out.print(next+" ");
            }
            System.out.println();
        }
    }
}
