import java.util.*;
import java.util.HashMap;

public class TimeConverter
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter amount: ");
      int totalMoney = scan.nextInt();
      
      int pesosCoin20 = totalMoney / 20;
      int remainingMoney = totalMoney % 20;
      int pesosCoin10 = remainingMoney / 10;
      remainingMoney = remainingMoney % 10;
      int pesosCoin5 = remainingMoney / 5;
      int pesoCoin1 = remainingMoney % 1;

      System.out.println("20 pesos coin: " + pesosCoin20);
      System.out.println("10 pesos coin: " + pesosCoin10);
      System.out.println("5 pesos coin: " + pesosCoin5);
      System.out.println("1 peso coin: " + pesoCoin1);
   }
}