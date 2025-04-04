public class Permutation {
    public static void main(String[] args) {
     String name = "abc";
     permutation("",name);

    }
    private static void permutation(String processed,String unProcessed)
    {
        if(unProcessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0,i);
            String  second = processed.substring(i,processed.length());
            permutation(first+ch+second,unProcessed.substring(1));

//            For permutation("cba", ""): Prints "cba"
//
//            For permutation("bca", ""): Prints "bca"
//
//            For permutation("bac", ""): Prints "bac"
//
//            For permutation("cab", ""): Prints "cab"
//
//            For permutation("acb", ""): Prints "acb"
//
//            For permutation("abc", ""): Prints "abc"
        }
    }

}
