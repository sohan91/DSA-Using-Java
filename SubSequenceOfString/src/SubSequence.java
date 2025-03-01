public class SubSequence {
    public static void main(String[] args) {
        String name = "abc";
        subSequence("",name);
    }

    public static void subSequence(String temp,String name)
    {
        if(name.isEmpty())
        {
            System.out.print("{"+temp+"} ");
            return;
        }
        char c = name.charAt(0);
       subSequence(temp+c,name.substring(1));//return when char in include
        subSequence(temp,name.substring(1));//char is exclude
    }
}

