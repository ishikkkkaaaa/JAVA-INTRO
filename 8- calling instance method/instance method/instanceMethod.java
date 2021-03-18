public class instanceMethod 
{
    public static void main (String arg[])
    {
       //so to call an instance method, we need to create an obj w static mthd

       instanceMethod obj = new instanceMethod();
       obj.disp();
       System.out.println("instanceMethod");
    }

void disp()  //instance method
{
    int a = 10; //local variable
    System.out.println(a);
}
}