public class index {
    public static void main ( String arg[])
    {
        //obj cannot be created of an instance
        //so we cannot get an output from any of the below interface
         Son obj = new Son();
         obj.disp();
    }
    
}

interface Father {
    //any variables written over here, are by default public static final!
     int mark = 100;
     int roll = 102;

     //all methods are by default PUBLIC
      public void disp();
}

class Son implements Father {
    int mark1 = 101;
    int sum = Father.mark + mark1;
    public void disp()
    {
        System.out.println("roll is: "+ Father.roll);
        System.out.println("sum is: "+ sum);
    }
}