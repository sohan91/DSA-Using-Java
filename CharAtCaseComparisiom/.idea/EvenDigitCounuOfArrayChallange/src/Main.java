public class Main {
    public static void main(String[] args) {
        int[] array = {1000,39,2,3242,27};
        System.out.println("even digit of array, number is "+getEvenDigit(array));
    }
    public static int getEvenDigit(int[] arr)
    {
        int count = 0;
        int num = 0;
        for(int i= 0;i<arr.length;i++)
        { num = arr[i];
           if(isEvenDigit(num))
           {
               count +=1;
           }
        }
        return count;
    }
    public static boolean isEvenDigit(int num)
    {
         return getDigit(num) % 2 == 0;
    }
    public static int getDigit(int num)
    {
        int count = 0;
        while(num>0)
        {
            int last = num % 10;
             num = num/10;
            count++;
        }
        return count;
    }
}
