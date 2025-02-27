public class BinarySearchSQRT {
    public static void main(String[] args) {
        double num= 20;
        int precession = 3;
        System.out.printf("Square root of %d is : %.3f",(int)num,squareRoot(num,precession));
    }

    public static double squareRoot(double num,int precession)
    {
        double  root = 0.1;
        double start = 0;
        double end = num;
        while (start<=end) {
            double mid = start + (end - start) / 2;
            if(mid*mid == num)
            {
                return mid;
            }
            else if((mid*mid)>num)
            {
                end = mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        double incr  = 0.1;
        for(int i = 0;i<precession;i++)
        {
                while(root*root<=num)
                {
                    root+=incr;
                }
                root-=incr;
                incr /=10;
        }
        return root;
    }
}
