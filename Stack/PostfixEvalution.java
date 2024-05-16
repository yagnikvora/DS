import java.util.*;

public class PostfixEvalution {
    public static double evaluate(String expression) {
        Stack<Double> s = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == ',') {
                continue;
            } else if (Character.isDigit(c)) {
                double num=0;
                while (Character.isDigit(c)) {
                    num = num * 10 + (c - '0');
                    i++;
                    c = expression.charAt(i);
                }
                i--;
                s.push(num);
                
            } else {
                double op1 = s.pop();
                double op2 = s.pop();
                s.push(calculate(c, op2, op1));
            }
        }
        return s.pop();
    }

    static double calculate(char c, double a, double b) {
        switch (c) {
            case '+':
                return (a + b);
            case '-':
                return (a - b);
            case '*':
                return (a * b);
            case '/':
                return (a / b);
            case '%':
                return (a % b);
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter postfix (use comma to saparate variables and oparands) :- ");
        String ex = sc.nextLine();
        System.out.println("Answer is :- " + evaluate(ex));
    }
}
