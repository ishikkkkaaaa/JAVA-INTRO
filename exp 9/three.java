import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("String: ");
        String s = input.nextLine();
        System.out.print("String after upper casing: ");
        for (int i = 0; i < s.length(); i++) {
            char s2 = s.charAt(i);
            if (97 <= s2 && s2 <= 122)
                s2 = (char) ((s2 - 32));
            System.out.print(s2);
        }
    }
}