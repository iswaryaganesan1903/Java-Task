import java.io.*;
class Student
{
     public static int count;
     public Student()
     {
          count = 0;
     }
     public static void increment()
     {
           count++;
     }
     public static void display()
     {
           System.out.println(" Count is "+count);
     } 
}


class Sample1
{
      public static void main(String []args)
      {
              Student s1 = new Student();
              Student s2 = new Student();
              Student s3 = new Student();
              s1.increment();
              s2.increment();
              s3.increment();
              //s1.display();
              Student.display();
      }
}