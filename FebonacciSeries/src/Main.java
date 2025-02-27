import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int prev = 0;
        int current = 1;
        System.out.print(prev+" " +current+" ");
        int count =2;//starts from
        while(count<=number)
        {
         int next= prev+current;
            System.out.print(next+" ");
            prev = current;
            current = next;
            count++;
        }
    }
}
