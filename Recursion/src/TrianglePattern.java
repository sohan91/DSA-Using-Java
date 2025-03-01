public class TrianglePattern {
    public static void main(String[] args) {
        int num = 4;
        pattern(num,0);
        System.out.println("Another Pattern"+"\n"+"-".repeat(30));
        pattern2(0,0,num);
    }
    public static void pattern(int r,int c)
    {
       if(r == 0)
       {
           return;
       }
       if(c<r)

       {
           System.out.print("* ");
           pattern(r,c+1);
       }
       else
       {
           System.out.println();
           pattern(r-1,0);
       }
    }
    public static void pattern2(int r,int c,int num)
    {
       if(r == num)
       {
           return;
       }
       if(r>=c)
       {
           System.out.print("* ");
           pattern2(r,c+1,num);
       }
       else {
           System.out.println();
           pattern2(r+1,0,num);
       }
    }
}
