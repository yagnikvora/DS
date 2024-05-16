import java.util.*;

public class PrefixEvalution {
    public static double evaluate(String expression) {
        Stack<Double> s = new Stack<>();
        for (int i = expression.length() - 1; i >= 0; i--) {
            char c = expression.charAt(i);
            if (c == ',') {
                continue;
            } else if (Character.isDigit(c)) {
                double num = 0;
                String temp = "";
                while (Character.isDigit(c)) {
                    temp += c;
                    i--;
                    c = expression.charAt(i);
                }
                i++;
                String str = "";
                for (int j = temp.length() - 1; j >= 0; j--) {
                    str += temp.charAt(j);
                }
                num = Double.parseDouble(str);
                s.push(num);

            } else {
                double op1 = s.pop();
                double op2 = s.pop();
                s.push(calculate(c, op1, op2));
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
                if (b == 0)
                    throw new ArithmeticException("Division by Zero");
                return (a / b);
            case '%':
                return (a % b);
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Prefix (use comma to saparate variables and oparands) :- ");
        String ex = sc.nextLine();
        System.out.println("Answer is :- " + evaluate(ex));
    }
}