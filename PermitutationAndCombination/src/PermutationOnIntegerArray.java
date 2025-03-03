import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationOnIntegerArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4};
        System.out.println(permutation(arr));
    }

    public static List<List<Integer>> permutation(int[] arr)
    {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res,new ArrayList<>(),arr,0);
        return res;
    }

    public static void backTrack(List<List<Integer>> result,ArrayList<Integer> temp,int[] arr,int index)
    {
        if(index == arr.length)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i = index;i< arr.length;i++)
        {

           swap(arr,index,i);
           temp.add(arr[index]);
          backTrack(result,temp,arr,index+1);
            temp.remove(temp.size()-1);
           swap(arr,index,i);//it will call when doing backtrack
        }
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
