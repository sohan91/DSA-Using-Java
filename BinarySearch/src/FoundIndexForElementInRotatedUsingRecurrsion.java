public class FoundIndexForElementInRotatedUsingRecurrsion {
    public static void main(String[] args) {
        int[] arr = {2,9,10,11,18,20,30,99,100};
        System.out.println("Index is : "+rbinary(arr,0,arr.length-1,100));
    }

    private static int rbinary(int[] arr, int start, int end, int target) {

       while (start<=end) {
           int mid = start + (end - start) / 2;
           if (arr[mid] == target) {
               return mid;
           } else if (arr[mid] > target && arr[start] <= target)
               return rbinary(arr, start, mid - 1, target);
           else if (arr[mid] < target && arr[end] >= target)
               return rbinary(arr, mid + 1, end, target);
       }
        return -1;
    }



}
