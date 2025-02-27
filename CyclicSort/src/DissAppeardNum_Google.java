import java.util.ArrayList;
import java.util.List;

public class DissAppeardNum_Google {

    public static void main(String[] args) {
        int[] array = {4,3,2,7,8,2,3,1};
        List<Integer> a = disappearElement(array);
        System.out.println(a);
    }
    public static <number> List<Integer> disappearElement(int nums[]) {
        List<Integer> num = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct])
            {
                swap(nums, i, correct);
            } else
            {
                i++;
            }
        }
        for (int index = 0;index<nums.length;index++)
        {
            if(nums[index] != index+1)
            {
                num.add(index+1);
            }
        }

        return num;
    }
    static void swap(int[] arr,int start, int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
