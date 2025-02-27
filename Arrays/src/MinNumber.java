import com.sun.jdi.Value;

public class MinNumber {
    public static void main(String[] args) {
        int[] array = {1,23,8,30,281,38};
        System.out.println(minNumber(array));
    }
    public static int minNumber(int[] num)
    {
        if(num.length == 0)
        {
            return -1;
        }
        int min = num[0];
        for(int index =1;index < num.length;index++)
        {
            if(num[index]<min)
            {
                min = num[index];
            }
        }
        return min;
    }

}
