public class SimpleRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static  void print(int n)
    {
        if(n == 10)//this condition is called base condition.It is helps to stop calling the other function
        {
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        print(n+1);
    }
}
