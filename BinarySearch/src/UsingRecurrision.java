public class UsingRecurrision {
    private static int BinarySearch(int[] arr,int start,int last,int target) {

        if(start > last) {
            return -1;
        }

            int mid = start + (last - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                return BinarySearch(arr, start, mid-1, target);
            }
                return BinarySearch(arr, mid+1, last, target);
    }
    public static void main(String[] args) {
int[] arr={2,4,9,10,40,50};
int len = arr.length-1;
int target = 10;
  System.out.println(BinarySearch(arr,0,len,target));
    }
}
