public class Main {
    public static void main(String[] args) {
        int[] arr = {2,9,2,2,2};
        int target = 2;
       System.out.println(search(arr,target));
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[start] <= nums[mid]) { // Left side is sorted
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;//if not we will step into the right side of middle
                }
            } else { // Right side is sorted
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;//if not we will step into the left side
                }
            }
        }
        return -1;
    }
}
