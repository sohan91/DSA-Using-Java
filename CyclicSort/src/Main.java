import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(cyclicSort(arr));

        //System.out.println("Missing number in an Array  is : "+Arrays.toString(res));
    }

    public static int cyclicSort(int[] arr)
    {
        int i = 0;
        while(i<arr.length)
        {
            int num = arr[i]-1;
            int origin = arr[i];
            if(arr[i] > 0 && arr[i]<=arr.length && arr[num]!=arr[i])
            {
                int temp = arr[num];
                arr[num] = arr[i];
                arr[i] = temp;
            }
            else
            {
                i++;
            }
        }
           for(int j=0;j<=arr.length;j++)
           {

               if(j!=(arr[j]-1))
               {
                   return j+1;
               }
           }
        return 0;
    }
}