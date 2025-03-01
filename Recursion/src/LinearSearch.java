import java.awt.print.Paper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,53,53};
        int target = 539;
        ArrayList<Integer> l = new ArrayList<>();
        System.out.println(linearSearch(arr,target,0,l));
    }
    public static ArrayList<Integer> linearSearch(int[] arr, int target,int index,ArrayList<Integer> list)
    {

        if(index==arr.length)
        {
            return list;
        }
        else if(arr[index]==target)
        {
            list.add(index);
        }
        return linearSearch(arr,target,index+1,list);
    }

}
