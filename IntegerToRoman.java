import java.util.*;
import java.util.HashMap;

public class IntegerToRoman
{
   public static int value(char r)
   {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
   }

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter Roman: ");
      String input = scan.nextLine();
      
      a
   }
   
   public static void RomanConverter(String input)
   {
      int result = 0;
      
      for(int a = 0; a < input.length(); a++)
      {
         int s1 = value(input.charAt(a));
         
         if(a + 1 < input.length())
         {
            int s2 = value(input.charAt(a+1));
            
            if(s1 >= s2)
            {
               result = result + s1;
            }
            else
            {
               result = result + s2 - s1;
               a++;
            }
         }
         else
         {
            result = result + s1;
         }
      }
      
      System.out.print("Equivalent: " + result);
   }
}