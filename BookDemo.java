import java.util.*;
import p1.*;
import p2.*;

class BookDemo
{
 public static void main(String arg[])
 {
   Scanner sc = new Scanner(System.in);
   int ch,ch1,ch2,i=0,k=0;
   Book b[] = new Book[3];
   Tape t[] = new Tape[2];
   
   do
    {
      System.out.println("Simren Publication");
      System.out.println("Main Menu");
      System.out.println("Book----1");
      System.out.println("Tape-------2");
      System.out.println("Exit----------3");
      System.out.println("Enter Choice");
      ch = sc.nextInt();
      
      switch(ch)
      {
        case 1:
          do
           {
             System.out.println("Book Publication");
             System.out.println("User Input---------------1");
             System.out.println("Display Book Details-----2");
             System.out.println("Exit---------------------3");
             System.out.println("Enter choice :");
             ch1 = sc.nextInt();
             
             switch(ch1)
             {
               case 1:
                  System.out.println("Enter Book Title, Price :");
                  String title = sc.next();
                  float price = sc.nextFloat();
                  b[i] = new Book();
                  b[i++].get_data(title,price);
                  break;
              
              case 2:
                 for(int j=0;j<i;j++)
                 b[j].put_data();
                 break;
             
              case 3:
                break;
             }
           }while(ch1!=3);
          break;
       
        case 2:
          do
           {
             System.out.println("Tape Publication");
             System.out.println("User Input---------------1");
             System.out.println("Display Tape Details-----2");
             System.out.println("Exit---------------------3");
             System.out.println("Enter choice :");
             ch2 = sc.nextInt();
             
             switch(ch2)
             {
               case 1:
                  System.out.println("Enter Tape Title, Price :");
                  String title = sc.next();
                  float price = sc.nextFloat();
                  t[k] = new Tape();
                  t[k].get_data(title,price);
                  k++;
                  break;
              
              case 2:
                 for(int j=0;j<k;j++)
                 t[j].put_data();
                 break;
             
              case 3:
                break;
             }
           }while(ch2!=3);
          break;
        
        case 3:
         break;
      }
    }while(ch!=3);
 }
}