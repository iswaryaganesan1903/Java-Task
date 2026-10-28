//example for Treemap
import java.io.*;
import java.util.*;
class Sample6
{
        public static void main(String []args)
        {
              TreeMap<Character,Integer> letter = new TreeMap<Character,Integer>();
              letter.put('e',13);
              letter.put('c',11);
              letter.put('a',15);
              letter.put('f',12);
              for(Map.Entry a:letter.entrySet())
              {
              System.out.println(a.getKey()+" : "+a.getValue());
              }
        }

}