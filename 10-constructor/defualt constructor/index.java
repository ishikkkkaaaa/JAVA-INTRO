public class index {
    public static void main (String arg[])
    {
        Test obj = new Test();
    }
    
}
 class Test{
     int a;   //instance v
     Test()
     {
         a=10;
         System.out.println("Vale of a is:" + a);

     }
 }