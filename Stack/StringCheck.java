import java.util.*;

public class StringCheck {
    static void check(String str) {
        String s = str;
        int i;
        Stack<Character> s1 = new Stack<>();
        s1.push('c');
        if (s.length() % 2 == 0) {
            System.out.println("Invalid String");
            System.exit(0);
        }
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'c')
                s1.push(s.charAt(i));
            else
                break;
        }
        for (i = s.lastIndexOf('c') + 1; i < s.length(); i++) {
            if (s.charAt(i) != s1.pop()) {
                System.out.println("invalid String");
                System.exit(0);
            }
            if (s1.peek() == 'c') {
                System.out.println("String is valid");
            }
        }
        if (s1.peek() != 'c') {
            System.out.println("Invalid String");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :- ");
        String str = sc.next();
        check(str);
    }
}
