import java.util.ArrayList;
import java.util.List;

public class Factorial {
    public static void main(String[] args) {
        int num = 0;
        factor(num);
    }
    public static void factor(int num)
    {
        List<Integer> list = new ArrayList<>();
        if(num<=0) {
            System.out.println("Invalid Input...");
            return;
        }
        if(num==1)
        {
            System.out.print(num+" ");
            return;
        }
        for(int i = 2;i<=Math.sqrt(num);i++)
        {
             if(num%i==0)
             {
                 list.add(i);
                 if (i != num / i) { // Avoid adding the same factor twice
                     list.add(num / i);
                 }
             }
        }
        list.sort((a,b)->a-b);
        for(Integer i : list)
        {
            System.out.print(i+" ");
        }
    }
}
