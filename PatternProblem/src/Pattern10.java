import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row or colomn to print pattern for 10 : ");
        int row = sc.nextInt();
int total = row*2;
        for (int i = 1; i < row * 2; i++) {
            if (i <= row) {

                for (int forSpace = 0; forSpace <= row - i - 1; forSpace++) {
                    System.out.print(" ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                for (int next = 2; next <= i; next++) {
                    System.out.print(next);
                }


                System.out.println();
            } else {
                for (int space = 1; space <= i - row; space++) {
                    System.out.print(" ");
                }
                for (int j = total - i ; j >= 1; j--) {
                    System.out.print(j);
                }
                for (int print = 2; print<=total-i; print++) {
                    System.out.print(print);
                }
                System.out.println();
            }

        }
    }
}
