import java.io.*;
import java.util.*;
abstract class Word
{
     public abstract int countConsonants();
     public abstract int countVowels();
}

class LetterCount extends Word
{
     int c1=0,c2=0;
     int i;
     String word;
     char x;
     public LetterCount()
     {
         Scanner ss = new Scanner(System.in);
         System.out.println("Enter a word: ");
         word = ss.next();
     }
     public int countVowels()
     { 
         word = word.toLowerCase();
         for(i=0;i<word.length();i++)
         {
              x = word.charAt(i);
              if(x=='a'|| x=='e'|| x=='i'|| x=='o'||x=='u')
              {
                   c1++;   
              }
                      
         }
         return c1;
     }
     public int countConsonants()
     {
         c2 = word.length() - c1;
         return c2;
     }
}

class Sample3
{
     public static void main(String []args)
     {
           Word w = new LetterCount();
           int result1 = w.countVowels();
           System.out.println("Vowels count in a word : "+result1);
           int result2 = w.countConsonants();
           System.out.println("Consonants count in a word : "+result2);

     }
}