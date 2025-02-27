import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to reverse : ");
        int number = sc.nextInt();
        System.out.println("Reverse of a Number is : " + reverse(number));
    }

    public static int reverse(int number) {
        int OriginalNumber = 0;
        if (number < 10) {
          return number;
          }

        while (number > 0) {
            int reminder = number % 10;
            number = number / 10;
            OriginalNumber = OriginalNumber * 10 + reminder;
        }
        return OriginalNumber;
    }

}