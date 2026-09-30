import java.io.*;
import java.util.*;
class markException extends Exception
{
      public markException(String a)
      {
             super(a);
      }
}
class Sample2
{
     public static void main(String []args)
     {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a mark");
            int mark = s.nextInt();
            try
            {
                  if(mark>=100)
                  {
                        markException ex = new markException("Out of Range mark");
                        throw ex;       
                  }
            }
            catch(markException ex)
            {
                   System.out.println("Error..."+mark+" "+ex.getMessage());
            }
            System.out.println("Mark : "+mark);
     }
}