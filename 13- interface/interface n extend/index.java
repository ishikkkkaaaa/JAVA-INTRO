public class index {
    public static void main (String arg[])
    {
        Son s = new Son();
        s.disp();
    }
}
//super class
class Father{
    int a = 10;
    int add(int y)
    {
        int b = y;
        return(a+b);
    }
}
//interface
interface Mother  //by default public static final
{
    int c = 30;
    void disp();       //abstract method(method in interface)
}

class Son extends Father implements Mother
{
    int m = a * Mother.c;
    int sum = add(20);

    public void disp()       //defining interface abstract method
    {
        System.out.println("Multiplication: "+ m);
        System.out.println("Sum: "+ sum);
    }
}