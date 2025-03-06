import java.util.ArrayList;
import java.util.List;

public class PermutationOnIntegerArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
//        List<List<Integer>> permutations = ;
        System.out.println(getPermute(arr));
    }

    public static List<List<Integer>> getPermute(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        permute(res, new ArrayList<>(), arr, 0);
        return res;
    }

    public static void permute(List<List<Integer>> list, List<Integer> temp, int[] arr, int index) {
        if (index == arr.length) {
            // Add a copy of the current permutation to the result list
            list.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            temp.add(arr[index]);  // Add the current element to the temp list
            permute(list, temp, arr, index + 1);
            temp.remove(temp.size() - 1);  // Remove the last element to backtrack
            swap(arr, index, i);  // Swap back to restore the original array
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}