import java.util.Scanner;
public class input {
    public static void main(String arr[])
    {
        int a;
        float b;
        String str;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter string");
        str = obj.nextLine();
        System.out.println("String is:" + str);
        System.out.println("Enter integer");
        a = obj.nextInt();
        System.out.println("Integer is:" + a);
        System.out.println("Enter float");
        b = obj.nextFloat();
        System.out.println("Float is:" + b);

    }
    
}
