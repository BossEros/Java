import java.util.*;
import java.util.HashMap;

public class FindDuplicateCharacters
{  
   public static void main(String[] args)
   {
      HashMap<Character, Integer> count = new HashMap<>();
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter word: ");
      String word = scan.nextLine();
      
      char[] result = word.toCharArray();
      
      for(char c : result)
      {
         if(count.containsKey(c))
         {
            count.put(c, count.get(c) + 1);
         }
         else
         {
            if(c != ' ')
            {
               count.put(c, 1);
            }
         }
      }
      
      for(Map.Entry<Character, Integer> entry : count.entrySet())
      {
         if(entry.getValue() > 1)
         {
            System.out.println(entry.getKey() + " : " + entry.getValue());
         }
      } 
   }
}