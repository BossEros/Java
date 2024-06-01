import java.util.*;

public class Anagram
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter first word: ");
      String word1 = scan.nextLine();
      System.out.print("Enter second word: ");
      String word2 = scan.nextLine();
      
      anagramChecker(word1, word2);
   }
   
   public static void anagramChecker(String word1, String word2)
   {
      boolean isAnagram = true;
      
      word1 = word1.replace(" ", "");
      word2 = word2.replace(" ", "");
   
      char[] firstWord = word1.toLowerCase().toCharArray();
      char[] secondWord = word2.toLowerCase().toCharArray();
      
      Arrays.sort(firstWord);
      Arrays.sort(secondWord);
      
      for(int a = 0; a < firstWord.length; a++)
      {
         if(firstWord[a] != secondWord[a])   
            isAnagram = false;
      }
      
      if(isAnagram)
         System.out.print("Anagram");
      else
         System.out.print("Not an Anagram");
   }
}