import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,0,8,1,93,28,100,12};
        int[] arrays = getArrayAscending(arr);
        System.out.println(Arrays.toString(arrays));
    }

    public static int[] getArrayAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean check = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j+1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    check = true;
                }
            }
            if(check == false)
            {
                break;
            }

        }
        return arr;
    }
}
