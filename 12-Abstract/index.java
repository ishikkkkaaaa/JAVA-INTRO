public class index {
    public static void main( String arg[])
    {
         Son s = new Son();
         Daughter d = new Daughter();
         s.disp();
         d.disp();
    }
}

abstract class Father
{
    abstract void disp();
}

class Son extends Father
{
    void disp()
    {
        System.out.println("Abstract method defined in sub class Son!");
    }
}

class Daughter extends Father
{
    void disp()
    {
        System.out.println("Abstract method defined in sub class Daughter!");
    }
}