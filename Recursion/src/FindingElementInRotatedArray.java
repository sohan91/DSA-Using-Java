public class FindingElementInRotatedArray {
    public static void main(String[] args) {
       int[] arr = {8,9,10,1,3,4};
       int target = 43;
        System.out.println("Index is : "+indexElement(arr,0,arr.length-1,target));
    }

    public static int indexElement(int[] arr,int start,int end,int target)
    {
       while(start<=end)
       {
          int mid = start+(end-start)/2;
          if(arr[mid] == target)
          {
              return mid;
          }

          if(arr[start]<=arr[mid])
          {
              if(arr[start]<=target && arr[mid]>=target)
              {
                return indexElement(arr,start,mid-1,target);
              }
              else {
                  return indexElement(arr,mid+1,end,target);
              }
          }
          else {
                if(arr[mid]<=target && arr[end]>=target)
                {
                    return indexElement(arr,mid+1,end,target);
                }
                else {
                    return indexElement(arr,start,mid-1,target);
                }
          }
       }
       return -1;
    }
}
