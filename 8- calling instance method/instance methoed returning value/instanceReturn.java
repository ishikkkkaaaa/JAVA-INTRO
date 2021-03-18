class instanceReturn
{
    public static void main (String arg[])
    {
        Test obj = new Test();
        System.out.println(obj.add());
        System.out.println(obj.multiply(2,3));

    }
}

class Test
{
    int add()
    {
        int a = 10, b = 20;
        return(a+b);

    } 

    int multiply( int n, int m)
    {
        return (m*n);
    }
}