import java.io.*;
import java.util.*;
interface codes
{
     int fact();
     void prodTable();    
}

interface impCodes 
{
     void prime();
}

class myclass implements codes,impCodes
{
      int f,i,m,n;
      boolean p;
      public myclass()
      {
          f=1;
          m=1;
          p=false;
          Scanner ss = new Scanner(System.in);
          System.out.println("Enter the number:");
          n = ss.nextInt();    
          
      }
      public int fact()
      {
            for(i=1;i<=n;i++)
            {
                 f = f*i;
            }
            return f;
      }
      public void prodTable()
      {
            for(i=1;i<=12;i++)
            {
                 m = i*n;
                 System.out.println(i +" * "+n+" = "+m);
            }
      }
      public void prime()
      {
            for(i=2;i<=n/2;i++)
            {
                 if(n%i == 0)
                 {
                      p=true;
                      break;
                 }
                 
            }
            if(p)
            {
                  System.out.println(n+" is not a prime number");
            }
            else
            {
                  System.out.println(n+" is a prime number");
            }
      }
           
}


class Sample2
{
    public static void main(String []args)
    {
          myclass obj = new myclass();
          int result = obj.fact();
          System.out.println("factorial = "+result);
          obj.prodTable();
          obj.prime();
    }
}
	