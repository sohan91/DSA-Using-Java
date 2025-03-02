import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Set {
    public static void main(String[] args) {
        // Input array
        int[] arr = {1, 2, 3};

        // Call the setOperation method and print the result
        System.out.println(setOperation(arr));
    }

    // Method to generate all possible subsets of the input array
    public static List<List<Integer>> setOperation(int[] arr) {
        // List to store all subsets
        List<List<Integer>> result = new ArrayList<>();

        // Call the backtracking method to generate subsets
        backTrack(result, new ArrayList<>(), arr, 0);

        // Return the list of subsets
        return result;
    }

    // Backtracking method to generate subsets
    public static void backTrack(List<List<Integer>> result, List<Integer> tempList, int[] arr, int start) {
        // Add the current subset (tempList) to the result list
        result.add(new ArrayList<>(tempList)); // Take a copy of the current subset to avoid modification

        // Iterate through the array to generate subsets
        for (int i = start; i < arr.length; i++) {
            // Add the current element to the temporary subset
            tempList.add(arr[i]);

            // Recursively call backTrack to generate subsets starting from the next index
            backTrack(result, tempList, arr, i + 1);

            // Remove the last element to backtrack and generate the next subset
            tempList.remove(tempList.size() - 1);
        }
    }
}