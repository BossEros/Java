import java.util.*;

public class BracketBalanced
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter string: ");
      String input = scan.nextLine();
      
      if(BalancedChecker(input))
         System.out.print("Balance");
      else
         System.out.print("Unbalance");
   }
   
   public static boolean BalancedChecker(String input)
   {
      Deque<Character> stack = new ArrayDeque<Character>();
      
      for(int a = 0; a < input.length(); a++)
      {
         char x = input.charAt(a);
         
         if(x == '(' || x == '{' || x == '[')
         {
            stack.push(x);
            continue;
         }
         
         if(stack.isEmpty())
         {
            return false;
         }
         
         char temp;
         switch(x)
         {
            case ')':
               temp = stack.pop();
               if(temp == '{' || temp == '[')
                  return false;
               break;
               
            case '}':
               temp = stack.pop();
               if(temp == '(' || temp == '[')
                  return false;
               break;
            
            case ']':
               temp = stack.pop();
               if(temp == '{' || temp == '[')
                  return false;
               break;
         }
      }
      
      return (stack.isEmpty());
   }
}