public class Main {
    public static void main(String[] args) {
        int[] array = {1,8,21,29,40,50,56,60,89,90};
        int target = 60;

        System.out.println(getElement(array,target));
    }
    public static int getElement(int[] arr , int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] > target)
            {
                end = mid-1;
            }
            else if(arr[mid] < target)
            {
                start = mid+1;
            }
        }
        return -1;
    }

}
