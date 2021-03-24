public class index {
    public static void main(String args[]) {
        NewHope obj = new NewHope();
        obj.Division(4);
        obj.Module(1);
        obj.disp();
    } 
}

//creating a interface, superclass!!
interface StarWars {
    void Division(int a);
    void Module(int b);
    void disp();
}

//subclass
class NewHope implements StarWars {
    int div, mod;

    public void Division(int a )
    {
        div = a;
    }

    public void Module(int b )
    {
        mod = b;
    }

    public void disp() //overridinnnnng
    {
        System.out.println("Division :" + div);
        System.out.println("Modules :" + mod);
    }
}