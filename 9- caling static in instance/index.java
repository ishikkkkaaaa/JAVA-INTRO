

public class index {
    public static void main ( String arg[] )
    {
        
        System.out.println(Test.add()); //calling static w/o obj
        Test obj = new Test();  //calling instance by first making an obj
        obj.instance();
        
    }
}
class Test {
    static int add()
    {
        
        int x = 10, y = 20;
        int z = x + y;
        
        return z;
    }

    void instance()
    {
        int a = add();
        System.out.println(a);
    }
};
