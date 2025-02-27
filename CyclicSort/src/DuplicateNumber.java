import java.util.concurrent.LinkedBlockingDeque;

public class DuplicateNumber {
    public static void main(String[] args) {
     int[] array = {3,3,3,3,3};
     System.out.println(getNumber(array));

    }
    public static int getNumber(int[] nums)
    {
        int i = 0;

        while(i<nums.length) {

            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                } else {
                    return nums[i];
                }

            } else {
                i++;
            }
        }
            return -1;

    }
}
