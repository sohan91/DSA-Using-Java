public class SumOfSDigit {
    public static void main(String[] args) {
        int num = 390;
        System.out.println("Sum of digit is : "+sumOfDigit(num));
    }
    private static int sumOfDigit(int num)
    {

        if(num==0)
        {
            return 0;
        }
       return num%10+sumOfDigit(num/10);
    }
}
