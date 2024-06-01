import java.util.*;
import java.util.HashMap;

public class ReverseString
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter word: ");
      String word = scan.nextLine();
      
      System.out.print("Reversed String: " + reverseString(word));
   }
   
   public static String reverseString(String input)
   {
      return new StringBuilder(input).reverse().toString();
   }
}