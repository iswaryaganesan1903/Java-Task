import java.io.*;
import java.util.*;
class Sample2
{
      public static void main(String []args)
      {
             Scanner ss = new Scanner(System.in);
             System.out.println("Enter a String :");
             String data = ss.next();
             char []x = data.toCharArray();
             for(char y:x)
             {
                    if(y=='a' ||y=='e' ||y=='i' ||y=='o' ||y=='u')
                    {
                           System.out.println(y);
                    }
             }
      }

}