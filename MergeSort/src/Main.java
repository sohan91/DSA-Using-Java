import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        int[] arr = {9,2,4,8,10};
        mergeSort(arr,0,arr.length);
        System.out.println("Sorted Array is : "+ Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr,int start,int end)
    {
        if((end-start)<=1)
        {
            return;
        }

        int mid = start+(end-start)/2;
        mergeSort(arr,start,mid);//to divide left side array
        mergeSort(arr,mid,end);//to divide right side array
        sortingElements(arr,start,mid,end);
    }

    private static int[] sortingElements(int[] arr, int start, int mid, int end) {
        int[] tempoArray = new int[end-start];
        int leftSubArrayIndex = start;
        int rightSubArrayIndex = mid;
        int indexOfTempArray = 0;

        while(leftSubArrayIndex < mid && rightSubArrayIndex < end)
        {
            if(arr[leftSubArrayIndex]< arr[rightSubArrayIndex])
            {
                tempoArray[indexOfTempArray] = arr[leftSubArrayIndex];
                leftSubArrayIndex++;
            }
            else {
                tempoArray[indexOfTempArray] = arr[rightSubArrayIndex];
                rightSubArrayIndex++;
            }
            indexOfTempArray++;
        }
        //There is chance of anyone of loop met false..because,any sub array is lenght is unequal then anyone sub
        // array will exit quick compare to another.Hence,we perform && operation if any condition met false then the
        // whole condition will be false .So,that's we performing individually

        while(leftSubArrayIndex < mid)
        {
            tempoArray[indexOfTempArray] = arr[leftSubArrayIndex];
            leftSubArrayIndex++;
            indexOfTempArray++;
        }

        while (rightSubArrayIndex < end)
        {
            tempoArray[indexOfTempArray] = arr[rightSubArrayIndex];
            rightSubArrayIndex++;
            indexOfTempArray++;
        }

        for(int l = 0;l<tempoArray.length;l++)
        {
            arr[start+l] = tempoArray[l];
        }
        return arr;
    }


}