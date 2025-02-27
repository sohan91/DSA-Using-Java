import java.util.Scanner;

//Magic Number = to find the magic number we need to convert the decimal to binary
//ex : 5 - 010
//Therefore,5*5*5*2*0+5*5*1+5*0 = 25
//to perfom we need to take the & operator to get the last digit
//then perform right >> shift operator  to remove the last digit.So,that original number will get update.
public class MagicNumber {
    public static void main(String[] args) {
        int base = 5;
        int ans = 0;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n > 0)
        {
            int lastDigit = n & 1;//get Last Digit
            n = n >> 1;//right sift opeator
            ans += base * lastDigit;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
