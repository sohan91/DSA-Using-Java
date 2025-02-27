public class MaxNum {
    public static void main(String[] args) {
        int arr[] = {10,2,1,48,20,199,293};
        System.out.println(maxNumber(arr));
    }
    public static int maxNumber(int [] array)
    {
        int max = array[0];
        for(int i = 1; i < array.length;i++)
        {
            if(array[i]>max)
            {
                max = array[i];
            }
        }
        return max;
    }
}
