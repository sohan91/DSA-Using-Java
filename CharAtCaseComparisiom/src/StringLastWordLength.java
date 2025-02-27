public class StringLastWordLength {

    public int leng(String s) {
        s.trim();
        int length = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
 }
       public static void main(String[] args) {
        StringLastWordLength s = new StringLastWordLength();
        int l = s.leng("Hello Wor ldgi");
        System.out.println("Length = "+l);
    }
}
