public class printNumbers {
    public static void main(String[] args) {
int num = 10;
        System.out.println("num to 1 to num");
    oneToNum(num);

        System.out.println("\nfrom num to 1");
        numToOne(num);

        System.out.println("\nPrinting Both");
        bothSide(num);
    }

    public static void oneToNum(int num)
    {
        if(num == 0)
        {
            return;
        }
        oneToNum(num-1);
        System.out.print(num+" ");
    }

    public static void numToOne(int num)
    {
        if(num == 0)
        {
            return;
        }
        System.out.print(num+" ");
        numToOne(num-1);
    }
    public static void bothSide(int num)
    {
        System.out.print(num+" ");
        if(num == 0) {
            return;
        }
        bothSide(num-1);
        System.out.print(num+" ");
    }

}
