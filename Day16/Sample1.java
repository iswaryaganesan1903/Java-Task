import java.io.*;
import java.util.*;
class Sample1
{
      public static void main(String []args)
      {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter two numbers : ");
            int a = s.nextInt();
            int b = s.nextInt();
            try{
                 int c = a/b;
                 System.out.println("division output is : "+c);
                 int []numbers = {10,20,30,40,50};
                 System.out.println("Access the array"+numbers[6]);
            }

            catch(ArithmeticException ex)
            {
                   System.out.println(ex.getMessage());   
            }
          
            catch(ArrayIndexOutOfBoundsException ex)
            {
                   System.out.println(ex.getMessage());
            }
            finally{
                  System.out.println("Free resources");
            }
            System.out.println("thank you");
            
      }

}
