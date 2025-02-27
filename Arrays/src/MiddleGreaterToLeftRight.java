import java.util.*;

public class MiddleGreaterToLeftRight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        if(arr[i+1]<arr[i])
        {
            System.out.print(arr[i]+" ");
        }

        for(int k = 1;k<arr.length-1;k++)
        {
            if((arr[k-1]<arr[k]) && (arr[k]>arr[k+1]))
            {
                System.out.print(arr[k]+" ");
            }
        }
        if(arr[num-1]>arr[num-2])
        {
            System.out.print(arr[num-1]+" ");
        }
    }
}