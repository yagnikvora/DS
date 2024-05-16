import java.util.*;
public class InfixToPostfix {
    static Stack<Character> op = new Stack<>();

    public static String toPostfix(String infix) {
        char c;
        String postfix = "";
        for (int i = 0; i < infix.length(); i++) {
            c = infix.charAt(i);
            if (Character.isLetter(c))
                postfix = postfix + c;
            else if (c == '(') {
                op.push(c);
            } else if (c == ')') {
                while (op.peek() != '(') {
                    postfix = postfix + op.pop();
                }
                op.pop();
            } else {
                while (!op.isEmpty() && prec(c) <= prec(op.peek()))
                    postfix = postfix + op.pop();
                op.push(c);
            }
        }
        while (!op.isEmpty())
            postfix = postfix + op.pop();
        return postfix;
    }

    static int prec(char x) {
        if (x == '^')
            return 3;
        if (x == '*' || x == '/' || x == '%')
            return 2;
        if (x == '+' || x == '-')
            return 1;
        return 0;
    }

    public static void main(String args[]) {
        String infix;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the infix expression you want to convert: ");
        infix = sc.nextLine();
        System.out.println("Postfix expression for the given infix expression is:" + toPostfix(infix));
    }

}
