//example for treeset
import java.io.*;
import java.util.*;
class Sample4
{
        public static void main(String []args)
        {
              TreeSet<Character> letter = new TreeSet<Character>();
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