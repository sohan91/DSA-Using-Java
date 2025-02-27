import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {20,3,42,23,48,204,8583};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int matchedIndex = linearSearch(array,target);
        System.out.println("target is found at "+matchedIndex+" index");
    }
    public static int linearSearch(int[] number,int target)
    {
        int size = number.length;
        if(size == 0)
        {
            return -1;
        }
        for(int index = 0;index<number.length;index++)
        {
            if(number[index] == target)
            {
                return index;
            }
        }
        return -1;

    }
}
