import java.util.Scanner;

public class UsinfMathClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = Math.min(Math.min(a,b),c);
        System.out.println("Min Value : "+min);
    }
}
