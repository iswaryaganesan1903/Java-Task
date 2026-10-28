import java.io.*;
import java.sql.*;
import  java.util.*;


class sample44
{

  public static void main(String []args)
  {
      
   try
   {

    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3307/mydatabase", "root", "Iswarya@05");

    System.out.println(" user name, password to update ");
    Scanner s=new Scanner(System.in);
    String uid=s.next();
    String uname=s.next();
    String upassword=s.next();

    String query= "update student set username ='" + uname+"',password='" + upassword+"'where userid ='"+uid+"';" ;


    Statement stmt= con.createStatement();
   
    stmt.executeUpdate( query );
  
    con.close();
   
    System.out.println( query );

   }
   catch(ClassNotFoundException  ex)
    {
      System.out.println(ex.getMessage() );
    }
   catch(SQLException  ex)
    {
      System.out.println(ex.getMessage() );
    }
 

  }

}