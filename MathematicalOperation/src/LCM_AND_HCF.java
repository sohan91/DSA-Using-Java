public class LCM_AND_HCF {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 32;

        System.out.println("LCM is : "+lcm(num1,num2));
        System.out.println("HCF is : "+hcfORgcf(num1,num2));
    }

    public static int hcfORgcf(int num1,int num2)
    {
        int temp = 0;
        for(int i = 1;i<num2;i++)
        {
            if((num1%i==0) && (num2%i == 0))
            {
                temp = i;
            }
        }
        return temp;
    }

    public static int lcm(int num1,int num2)
    {
        return (num1*num2)/hcfORgcf(num1,num2);
    }
}
