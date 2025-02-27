import com.sun.jdi.VMMismatchException;
import com.sun.source.tree.BreakTree;

public class Main {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,10,12,14,16,18,20};
        int target = 17;
        System.out.println(getTaregetElement(a, target));
    }
    public static  int getTaregetElement(int[] arr,int target)
    {
        if(target>arr[arr.length-1])
        {
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        int mid  = 0;
        while (start<=end)
        {
            mid = start+(end-start)/2;
            if(target == arr[mid])
            {
                return mid;
            }
            else if(target < arr[mid])
            {
                end = mid -1;
            }
            else if(target>arr[mid])
            {
                start = mid+1;
            }
            else {
                return mid;
            }
            }
        return arr[end];
        }
    }
