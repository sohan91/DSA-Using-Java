public class Main {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
    static int fibo(int num)
    {
        return (int)(Math.pow(((1+Math.sqrt(5))/2),num) / Math.sqrt(5));
    }
}
