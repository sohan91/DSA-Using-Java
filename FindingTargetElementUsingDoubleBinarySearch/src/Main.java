import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] res = searchRange(arr, target);
        System.out.println(Arrays.toString(res));
    }

    public static int[] searchRange(int[] nums, int target) {
        int leftElement = leftSearchingElement(nums, target);
        int rightElement = rightSearchingElement(nums, target);
        return new int[]{leftElement, rightElement};
    }

    private static int leftSearchingElement(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                index = mid;
                end = mid - 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }

    private static int rightSearchingElement(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                index = mid;
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }
}
