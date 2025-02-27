import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++)
        {
            for(int k = 1;k<=num-i;k++)

                System.out.print("* ");
            int copyVar = num;
            for(int j=1;j<=i;j++)
            {
                System.out.print(copyVar+" ");
                copyVar--;
            }
            System.out.println();
        }
    }
}