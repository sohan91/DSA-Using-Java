public class FoundIndexForElementInRotated {
    public static void main(String[] args) {
        int[] arr = {8,9,10,1,2,3};
       System.out.println("Target element is at : " + binarySearch(arr,0,arr.length-1,3));

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
            if(arr[start]<=arr[mid])
            {
                if(arr[start]<=target && arr[mid]>target)
                {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else
            {
               if(arr[mid]<target && arr[end]>=target)
               {
                   start = mid+1;
               }
               else {
                   end = mid-1;
               }
            }
        }
        return -1;
    }
}
