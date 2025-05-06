import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreatestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] arr = new int[size];
        for(int i = 0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        NextGreaterElement ng = new NextGreaterElement();
        int[] temp = ng.getGreater(arr,size);
        System.out.println(Arrays.toString(temp));
    }
}
class NextGreaterElement
{
    public int[] getGreater(int[] arr,int size)
    {
        if(size == 1 || size == 0)
        {
            return arr;
        }
        int[] temp = new int[size];
        Stack<Integer> stack = new Stack<>();
        int i = size-1;
        int j = 0;
        for(int k = size-1;k>=0;k--)
        {
            while(!stack.isEmpty() && stack.peek()<=arr[k])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                temp[k] = -1;
            }
            else
            {
                temp[k] = stack.peek();
            }
            stack.push(arr[k]);
        }
        return temp;
    }
}
