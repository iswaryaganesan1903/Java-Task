import java.io.*;
class myclass
{
   int result1,result2;
   float result3;
   public void area(int a)
   {
     result1 = a*a;
     System.out.println(result1);
   }
   public void area(int a,int b)
   {
     result2 = a*b;
     System.out.println(result2);
   }
   public void area(int a,float b)
   {
      result3 = 0.5f*a*b;
      System.out.println(result3);
   }
 
}

class Sample1
{
    public static void main(String []args)
    {
         myclass m = new myclass();
         m.area(25);
         m.area(25,10);
         m.area(25,10.5f);
    }

}