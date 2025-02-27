import java.util.Scanner;

public class SkipNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<size;i++)
        {
            if(arr[i]<0 && i == (size-1))
            {
                System.out.print(arr[0]+" ");
                return;
            }
            if(arr[i]<0)
            {
                System.out.print(arr[i+1]+" ");
            }
        }
    }
}
