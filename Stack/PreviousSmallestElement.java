import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PreviousSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] arr = new int[size];
        System.out.println("Enter element for size is : "+size);
        for(int i = 0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        PrevSmallest prev = new PrevSmallest();
        int[] temp = prev.getPrevSmallest(arr,size);
        System.out.println("Prev Smallest List is : "+Arrays.toString(temp));
    }
}

class PrevSmallest
{
    public int[] getPrevSmallest(int[] arr,int size)
    {
        Stack<Integer> stack = new Stack<>();
        int[] temp = new int[size];
        if(size == 0 || size == 1)
        {
            return arr;
        }
        for(int i = 0;i<size;i++)
        {
            while(!stack.isEmpty() && stack.peek()>arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                temp[i] = -1;
            }
            else {
                temp[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return temp;
    }
}
