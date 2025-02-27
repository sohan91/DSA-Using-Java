import java.io.*;
import java.util.*;

public class pattern12{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<0)
        {
            System.out.print("No output generated");
            return;
        }
        for(int i = 0;i<num;i++)
        {
            char c = 'A';
            for(int k = 0;k<num-i-1;k++)
            {
                System.out.print(" ");
            }
            for(int j = 0;j<=i;j++)
            {
                System.out.print(c);
                c++;
            }

            System.out.print("\n");
        }
    }
}