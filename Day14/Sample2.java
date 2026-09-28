import java.io.*;
class Company1
{
    public void car()
    {
       System.out.println("car manufacturing company");
    }
    public void bike(){
       System.out.println("bike manufacturing company");
    }
}
class Company2 extends Company1
{
    public void car()
    {
        System.out.println("new cars are manufactured");
    }
}


class Sample2
{
    public static void main(String [] args){
         Company1 c = new Company2();
         c.car();
         c.bike();
    }
}