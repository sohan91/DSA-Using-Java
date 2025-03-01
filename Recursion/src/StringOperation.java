public class StringOperation {
    public static void main(String[] args) {
        String name = "adhknaoisadawe";
        System.out.println(skipAletter(name));
    }

    private static String skipAletter(String name) {
        if(name.isEmpty())
        {
            return " ";
        }
        char ch = name.charAt(0);
        if(ch == 'a' || ch == 'd' )
        {
          return  skipAletter(name.substring(1));
        }
        return ch + skipAletter(name.substring(1));
    }
}
