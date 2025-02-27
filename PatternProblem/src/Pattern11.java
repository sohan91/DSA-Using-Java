import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of colomn and rows for pattern11 : ");
        int n = sc.nextInt();
        for(int i = 0;i<=n*2;i++)
        {
            for(int j = 0;j<=n*2;j++)
            {
                int number = n - Math.min(Math.min(i,j),Math.min(n*2-i,n*2-j));
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
}
