import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main
{
   public static void main (String[] arg)
   {
      
      
      int arrayIndex = 20;
     int[]  arrayOfBills = new int[arrayIndex];


      Scanner availBills = new Scanner(System.in);

      boolean endOfBills = false;

      int noOfBills = 0;

      while(endOfBills == false)
      {

         System.out.println("Enter the avilable bill amount:");



        int bill = availBills.nextInt();

         if(bill==0)
         {
            endOfBills = true;
            System.out.println("Thanks for your input");
         }

         else
         {
             arrayOfBills[noOfBills] = bill;

             noOfBills++;
         }



      }
      
      Arrays.sort(arrayOfBills);

      System.out.println(Arrays.toString(arrayOfBills));

        Scanner sale = new Scanner(System.in);


        System.out.println("Enter the sale amount:");

        int saleAmount = sale.nextInt();


        System.out.println("Amount recieved from customer:");

        int amountRecieved = sale.nextInt();


        int balance = amountRecieved - saleAmount;
        
        System.out.println("Total Balance: $" + balance);
        
        int counter = 0;
        
        int searchIndex = arrayIndex-1;
        

        while(balance != 0)
        {

              if(balance >= arrayOfBills[searchIndex])
              {
                  balance = balance-arrayOfBills[searchIndex];
                  counter++;
                  
              }  
              else
              {
                  
                  searchIndex--;
              }
              
              
              if(counter != 0 && balance < arrayOfBills[searchIndex])
              {
                  System.out.println(counter + " X $" + arrayOfBills[searchIndex]);
                  counter = 0;
              }
              

               



        } 




   }
}
