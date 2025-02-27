public class PrimeNumber {
    public static void main(String[] args) {

        int num = 30;
        for(int i = 0;i<num;i++) {
            primeNumber(i);
        }
    }
    static void primeNumber(int num)
    {
        if(num==1)
        {
            System.out.println(num+" is a prime number");
            return;
        }
        int current = 2;
        while(current*current< num)
        {
            if((num%current==0)) {
                System.out.println(num+" is not a prime Number");
               return;
            }
            current++;
        }
        System.out.println(num+" is prime Number");
    }
}
