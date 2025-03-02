import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Set {
    public static void main(String[] args) {
       int[] arr = {1,2,3,10};
        System.out.println(setOperation(arr));
    }
    public static List<List<Integer>> setOperation(int[] arr)
    {
                  List<List<Integer>> result = new ArrayList<>();
                backTrack (result,new ArrayList<>(),arr,0);
                  return result;
    }
    public static void backTrack(List<List<Integer>> result,List<Integer> tempList,int[] arr,int start)
    {
        result.add(new ArrayList<>(tempList));//take the copy of original array
        for(int i = start;i<arr.length;i++)
        {
            tempList.add(arr[i]);
            backTrack(result,tempList,arr,i+1);
            tempList.remove(tempList.size()-1);
        }
    }

}
