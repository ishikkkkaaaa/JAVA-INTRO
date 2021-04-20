public class fourth {
    public static void main(String args[]) {
        Data d1 = new Data("ishika kesarwani");
        d1.disp();
        Data d2 = new Data("saksham lambha");
        d2.disp();
    }
}

class Data {
    String name;

    Data(String n) {
        name = n;
    }

    void disp() {
        System.out.println("Name :" + name);
        int c = 0;
        int len = name.length();
        for (int i = 0; i < len; i++)
            if (name.charAt(i) == 'A' || name.charAt(i) == 'a') {
                c++;
                System.out.println("number of occurance :" + c);
                System.out.println("Possition :" + (i + 1));
            }
        if (c == 0)
            System.out.println("there is no 'A' available in the string");
    }
}