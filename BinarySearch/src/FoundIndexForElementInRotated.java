public class FoundIndexForElementInRotated {
    public static void main(String[] args) {
        int[] arr = {2,9,10,11,18,20,30};
       System.out.println("Target element is at : " + binarySearch(arr,0,arr.length-1,10));

    }

    public static int binarySearch(int[] arr,int start,int end,int target)
    {
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target && arr[start]<=target)
            {
                end = mid-1;
            }

            else if(arr[mid]<target && target<=arr[end])
            {
                start = mid+1;
            }
        }
        return -1;
    }
}
