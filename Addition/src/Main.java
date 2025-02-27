import java.util.Scanner;

class InputData
{
    int x,y,z;
    void setData(int a,int b)
    {
        x=a;
        y=b;
        z = x+y;

    }
    void printData()
    {
        System.out.println("x value is : "+x);
        System.out.println("y value is : "+y);
        System.out.println("sum is : "+z);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter second Number : ");
        int b = sc.nextInt();
        InputData input = new InputData();
        input.setData(a,b);
        input.printData();
    }
}
