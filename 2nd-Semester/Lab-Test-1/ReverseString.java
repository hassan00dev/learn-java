import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();

        System.out.println("Reverse String: " + reverseStr(str));
    }

    public static String reverseStr(String str) {

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }
}
