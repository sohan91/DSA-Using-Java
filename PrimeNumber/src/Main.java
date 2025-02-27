import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it is prime or not : ");
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println(num + " is prime Number nor Composite Number");
            return;
        }
        int temp = 2;
        while (temp<num) {
            if (num % temp == 0) {
                System.out.println(num + " is not a Prime Number ");
                return;
            } else {
                temp += 1;
            }
        }
            System.out.println(num + " is a Prime Number ");


    }
}
