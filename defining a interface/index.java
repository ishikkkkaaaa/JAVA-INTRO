public class index {
    public static void main ( String arg[])
    {
        //obj cannot be created of an instance
        //so we cannot get an output from any of the below interface
         
    }
    
}

interface Father {
    //any variables written over here, are by default public static final!
     int mark = 100;
     int roll = 102;

     //all methods are by default PUBLIC
      public void disp();
      //can remove public uppr
      int add (int x, int y); 
}

interface Mother {
    int a = 103;
    void ab();
}

interface Son extends Father,Mother {
    int attendance = 75;
    void putData(); 
}
