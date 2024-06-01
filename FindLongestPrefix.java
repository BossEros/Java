import java.util.*;
import java.util.HashMap;

public class FindLongestPrefix 
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      String[] wordArray = {"apple", "ape", "zebra"};
      
      System.out.println( "The longest Common Prefix is : " +
                                   FindPrefix(wordArray));
      
   }
   
   public static String FindPrefix(String[] wordArray)
   {
      if(wordArray.length == 0)
         return "";
         
      if(wordArray.length == 1)
         return wordArray[0];
         
      Arrays.sort(wordArray);
      
      int end = Math.min(wordArray[0].length(), wordArray[wordArray.length -1].length());
      
      int i = 0;  
      while(i < end && wordArray[0].charAt(i) == wordArray[wordArray.length - 1].charAt(i))
         i++;
         
      String result = wordArray[0].substring(0, i);
      return result;
   }
}