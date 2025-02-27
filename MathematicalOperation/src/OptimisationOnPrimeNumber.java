public class OptimisationOnPrimeNumber {
    public static void main(String[] args) {
      int num = 19;
      boolean[] isPrimes = new boolean[num+1];

          isPrime(num,isPrimes);

    }

    public static void  isPrime(int num,boolean[] arr)
    {
        if(num ==1)
        {
            System.out.print(num+" ");
        }
        for(int i = 2;i*i<arr.length;i++)
        {
            if(!(arr[i]))
            {
                for(int j = 2*i;j<=num;j+=i)
                {
                    arr[j] = true;//non-prime numbers set to ture;
                }
            }
        }
        for(int k = 2;k<=num;k++)
        {
            if(!arr[k])
            {
                System.out.print(k+" ");
            }
        }
    }
}
