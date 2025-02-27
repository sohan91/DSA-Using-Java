import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        int[] array = {1};
        List<Integer> a = getNumber(array);
        System.out.println(a);
    }

    public static List<Integer> getNumber(int[] nums) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < nums.length) {

            int correct = nums[i] - 1;
            if (nums[correct] == nums[i]) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
        }

            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index+1) {
                    ans.add(nums[index]);
                }
            }

        return ans;
    }
}