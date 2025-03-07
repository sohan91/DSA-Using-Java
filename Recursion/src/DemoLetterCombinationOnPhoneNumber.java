import java.util.ArrayList;
import java.util.List;

public class DemoLetterCombinationOnPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(getCombination(digits));
    }

    public static List<String> getCombination(String digits)
    {
        List<String> stringList = new ArrayList<>();
        if(digits == null || digits.isEmpty())
        {
            return stringList;
        }
        String[] alpha = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String[] strArray = new String[digits.length()];

        for(int i=0;i<digits.length();i++)
        {
            int index = (int) digits.charAt(i) -'0';
            strArray[i] = alpha[index];
        }
        getStringCombination(stringList,strArray,0,"");
        return stringList;
    }

    public static void getStringCombination(List<String> list,String[] arr,int index,String tempString)
    {
         if(index == arr.length)
         {
             list.add(tempString);
             return;
         }

         for(int i = 0;i<arr[index].length();i++)
         {
             char ch = arr[index].charAt(i);
             getStringCombination(list,arr,index+1,tempString+ch);
         }
    }

}
