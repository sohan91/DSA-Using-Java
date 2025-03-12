import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subSet(arr));
    }
    public static List<List<Integer>> subSet(int[] arr)
    {
        List<List<Integer>> res = new ArrayList<>();
        sets(res,new ArrayList<>(),arr,0);
        return  res;
    }
    public static void sets(List<List<Integer>> res,List<Integer> ls,int[] arr,int index)
    {
            res.add(new ArrayList<>(ls));
        for (int i = index;i<arr.length;i++)
        {
           ls.add(arr[i]);
           sets(res,ls,arr,i+1);
            ls.remove(ls.size()-1);
        }
    }

}
