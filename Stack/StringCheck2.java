import java.util.*;

public class StringCheck2 {
    static void check(String str) {
        Stack<Character> s1 = new Stack<Character>();
        String s = str;
        if (s.length() % 2 == 1) {
            System.out.println("Invalid String");
            System.exit(0);
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                s1.push(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b')
                s1.pop();
        }
        if (s1.isEmpty())
            System.out.println("String is valid");
        else
            System.out.println("String is Invalid");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :- ");
        String str = sc.next();
        check(str);
    }
}
