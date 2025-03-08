public class StringOperation {
    public static void main(String[] args) {
        String name = "adhknaoisadawe";
        System.out.println(skipChoiceLetter(name));
    }

    private static String skipChoiceLetter(String name) {
        if(name.isEmpty())
        {
            return " ";
        }
        char ch = name.charAt(0);
        if(ch == 'a' || ch == 'd' )
        {
          return  skipChoiceLetter(name.substring(1));
        }
        return ch + skipChoiceLetter(name.substring(1));
    }
}
