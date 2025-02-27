public class Main {
    public static void main(String[] args) {

        System.out.println(isOdd(10));
    }
 public static String isOdd(int number)
 {
     return (number & 1 ) == 1 ? number + " is an Odd Number":number+ " is a Even Number";

     // 10 ->1010
     //  1 ->0001
     //ans = 0000 bys performing and operation
 }
}
