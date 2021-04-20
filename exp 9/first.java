
import java.util.Scanner;

class first {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("String: ");
        String s1 = input.nextLine();
        System.out.print("Character or substring to be searched: ");
        String s2 = input.nextLine();
        int len1 = s1.length();
        int len2 = s2.length();
        int index = 0;
        for (int i = 0; i <= (len1 - len2); i++) {
            if (s1.substring(i, len2 + i).equals(s2)) {
                if (index == 0)
                    System.out.println("First occurance: " + i);
                index = i + 1;
            }
        }
        if (index != 0)
            System.out.println("Last occurance: " + (index - 1));
        else
            System.out.println("No such character or substring found");
    }
}
