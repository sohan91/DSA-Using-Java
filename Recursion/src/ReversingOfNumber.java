public class ReversingOfNumber {
    public static void main(String[] args) {
        int num = 3822;
        System.out.println("Reversed Number is : "+reverseNumber(num,0));
    }

    private static int reverseNumber(int num,int rev)
    {
        if(num==0)
        {
            return rev;
        }
        int mod = (rev * 10)+(num%10);
       return reverseNumber(num/10,mod);

    }
}
