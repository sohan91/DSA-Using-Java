import java.util.Scanner;

public class Patter7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a rows and coloms : ");
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++)
        {
            for(int j = 1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k = 1;k<=num-i;k++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
