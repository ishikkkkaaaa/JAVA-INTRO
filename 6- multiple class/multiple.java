class Example{
    int a,b,total=0;
    void add()
    {
        total = a+b;
    }
}
public class multiple {
    public static void main (String a[])
    {
        Example obj = new Example();
        obj.a = 10;
        obj.b = 20;
        obj.add();
        System.out.println("Addition=" + obj.total);
    }
    
}
