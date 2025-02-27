public class Main {
    public static void main(String[] args) {
        int number = 624665466;
        int count = 0;
        while(0<number)
        {
            int rem = number%10;
            if(rem == 6)
            {
                count++;
            }
            number = number/10;
        }
        System.out.println(count);
    }
}
