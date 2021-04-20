import java.util.Scanner;

public class two {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        StringBuffer s = new StringBuffer("Hello");
        System.out.println("String: " + s);
        System.out.print("String after upper casing: ");
        for (int i = 0; i < s.length(); i++) {
            char s2 = s.charAt(i);
            if (97 <= s2 && s2 <= 122)
                s2 = (char) ((s2 - 32));
            System.out.print(s2);
        }
    }
}