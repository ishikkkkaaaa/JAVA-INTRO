public class index {
    public static void main (String arg[])
    {
        Test obj = new Test(10,20);
    }
    
}
 class Test{
     int a, b;   //instance v
     Test(int x, int y)
     {
         a = x;
         b = y;
         System.out.println("Value of a & b is: "+ a +" "+ b);

     }
 }