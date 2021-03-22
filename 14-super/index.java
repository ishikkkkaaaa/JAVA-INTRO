public class index {
    public static void main( String arg[])
    {
        Son s = new Son();
        s.disp();
    }
}

class Father{
    int a = 100;
}

class Son extends Father{
    int a = 200;
    void disp()
    {
        System.out.println("Value of super a is: "+ super.a);      //supper 
        System.out.println("Value of super a is: "+a);
    }
}