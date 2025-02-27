public class HCFUsingEuclidAlgm {
    public static void main(String[] args) {
        int num1 = 20;
        int num2  = 40;
        System.out.println("hcf is : "+hcf(num1,num2));
    }

    public static int hcf(int num1,int num2)
    {
       while (num2!=0)
       {
           int temp = num2;
           num2 = num1%num2;
           num1 = temp;
       }
        return num1;
    }

}
