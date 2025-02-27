public class UniqueElementInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
        System.out.println(uniqueElement(arr));
    }
    public static int uniqueElement(int[] number)
    {
        int unique = 0;
       for(int i = 0; i <= number.length-1;i++)
       {
           unique ^= number[i];
       }
        return unique;
    }
}
