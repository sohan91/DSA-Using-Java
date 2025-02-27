import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

            if(armStrong(number))
            {
                System.out.print(number+" is ArmStrong number");
                return;
            }
        System.out.print(number+" is not ArmStrong number");



    }
    public static boolean armStrong(int number) {
        int temp = number;
        int digitCount = 0;
        while (temp>0)
        {

            digitCount++;
            temp/=10;
        }
        temp = number;
        int sum = 0;
        while (number > 0) {
            int rem = number % 10;
            int last = rem;
            for(int i = 0;i<digitCount-1;i++)
            {
                last*=rem;
            }
            sum+=last;
            number /= 10;

        }return temp == sum ? true : false;

    }

}

