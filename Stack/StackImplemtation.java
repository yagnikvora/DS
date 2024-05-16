import java.util.*;

class Stackimp {
    int top;
    int sa[];
    int n;

    Stackimp(int size) {
        n = size;
        sa = new int[n];
        top = -1;
    }

    public void push(int value) {
        if (top == (n - 1))
            System.out.println("\nStack is overflow!!!!\n");
        else {
            sa[++top] = value;
            System.out.println(value + " is pushed!!\n");
            System.out.print("Top = " + top);
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("\nStack is underflow!!!\n");
            return -1;
        } else {

            int poppedValue = sa[top--];
            // System.out.println(poppedValue+" is popped!!\n");
            // System.out.print("Top = "+top);
            return poppedValue;
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("\nStack is underflow!!!\n");
            return -1;
        } else {
            System.out.println("\nPeek is " + sa[top] + "\n");
            return sa[top];
        }
    }

    public int peep(int in) {
        if (top == -1) {
            System.out.println("\nStack is underflow!!!\n");
            return 0;
        } else
            return sa[in];
    }

    public void display() {
        if (top == -1) {
            System.out.println("\nStack is underflow!!!\n");
        } else {
            System.out.println("\nStack is here\n");
            for (int i = 0; i <= top; i++) {
                System.out.print(sa[i] + ",");
                System.out.println("Top = " + i);
            }
        }
    }

    public void change(int i, int value) {
        if (top == -1) {
            System.out.println("\nStack is underflow!!!\n");
        } else {
            sa[i - 1] = value;
        }
    }
}

public class StackImplemtation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Stack :- ");
        int n = sc.nextInt();

        Stackimp s = new Stackimp(n);
        System.out.println("\nPress 1 for push\nPress 2 for pop\n");
        int a = sc.nextInt();
        int val;
        while (a > 0) {
            switch (a) {
                case 1:
                    System.out.print("\nEnter Value to insert :- ");
                    int v = sc.nextInt();
                    s.push(v);
                    break;
                case 2:
                    val = s.pop();
                    System.out.println(val + " is popped!!\n");
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    System.out.print("\nEnter position to peep :- ");
                    int in = sc.nextInt();
                    System.out.println(s.peep(in));
                    break;
                case 6:
                    System.out.print("Enter position to change : - ");
                    int p = sc.nextInt();
                    System.out.print("Enter value to change : - ");
                    val = sc.nextInt();
                    s.change(p, val);
                    break;
                default:
                    System.out.println("Enter valid operation");
                    break;
            }
            System.out.println(
                    "\nPress 1 for push\nPress 2 for pop\nPress 3 for peek element\nPress 4 for display stack\nPress 5 for peep\nPress 6 for change element\nPress 0 for Exit\n");
            a = sc.nextInt();
        }

    }
}
