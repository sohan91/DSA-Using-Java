public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,29,104,5,6};
        int target = 3;
        System.out.print("Index is : "+linearSearch(arr,target,0));

    }
    public static int linearSearch(int[] arr,int target,int index)
    {
        if(index>=arr.length-1)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
        return linearSearch(arr,target,index+1);
    }

}
