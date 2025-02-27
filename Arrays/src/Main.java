import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[4];
        list(array);
    }
    public static void list(int[] array)
    {
        Scanner sc = new Scanner(System.in);
        array = new int[4];
        for(int i = 0;i<array.length;i++)
        {
            array[i] = sc.nextInt();
        }System.out.println("Before Sorting = "+Arrays.toString(array));
          Arrays.sort(array);
        System.out.print("After Sorting = "+Arrays.toString(array));

            }
}
