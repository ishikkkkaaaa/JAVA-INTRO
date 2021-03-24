class faculty 
{
    int fac_id;
    String fac_name;
    void display()
    {
        System.out.println("Faculty id:"+ fac_id);
        System.out.println("Faculty name:"+ fac_name);
    }

    public static void main(String a[])
    {
        faculty f1 = new faculty();
        f1.fac_id = 1;
        f1.fac_name = "ishika";
        faculty f2 = new faculty();
        f2.fac_id = 2;
        f2.fac_name = "kriti";
        f1.display();
        f2.display();
    }
}
