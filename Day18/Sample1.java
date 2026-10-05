import java.io.*;
import java.util.*;
class Sample1
{
     public static void main(String []args)
     {
            String []colours = {"Yellow","Red","White","blue"};
            for(int i = 0; i<colours.length;i++)
            {
                 System.out.println(colours[i]);
            }

            String []fruits = new String[4];
            Scanner s = new Scanner(System.in);
            for(int i=0;i<fruits.length;i++)
            {
                  fruits[i] = s.next();
            }
            for(int i = 0; i<colours.length;i++)
            {
                  System.out.println(fruits[i]);
            }

     }
}