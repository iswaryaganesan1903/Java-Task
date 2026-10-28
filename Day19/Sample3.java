//example for hashset
import java.io.*;
import java.util.*;
class Sample3
{
        public static void main(String []args)
        {
              HashSet<Character> letter = new HashSet<Character>();
              letter.add('e');
              letter.add('c');
              letter.add('a');
              letter.add('f');
              for(Character a:letter)
              {
              System.out.println(a);
              }
        }

}