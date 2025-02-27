public class Main {
    public static void main(String[] args) {
        int arra[] = {1,3,5,8,10,17,19,20,28,67};
        int target = 50;
        System.out.println(getCeiling(arra,target));
    }
    public static int getCeiling(int[] arr,int target)
    {
        if(target > arr[arr.length - 1]) {
            return -1; // returns -1 if target is greater than the greatest number in the array
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid]; // target found
            }
        }
        return arr[start]; // smallest number greater than or equal to target,and if we replace start by end we will get greatest small number to the target
                             //else if we put start, return the smallest gratter number to the target
    }
}
