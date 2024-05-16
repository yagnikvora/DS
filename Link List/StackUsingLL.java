import java.util.*;

class StackLL {
    Node top;

    public void push(int a) {
        if (top == null) {
            Node newNode = new Node();
            newNode.data = a;
            newNode.next = null;
            top = newNode;
            System.out.println(a + " is pushed");
        } else {
            Node newNode = new Node();
            newNode.data = a;
            newNode.next = top;
            top = newNode;
            System.out.println(a + " is pushed");

        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            int data = top.data;
            top = top.next;
            System.out.println(data + " is popped");

        }
    }

    public void display() {
        if (top == null)
            System.out.println("Stack is empty");
        else {
            Node save = top;
            System.out.println();
            while (save != null) {
                System.out.println(save.data);
                save = save.next;
            }
        }
    }

    public void peek() {
        System.out.println("Peek is " + top.data);
    }

}

public class StackUsingLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLL s = new StackLL();
        System.out.println(
                "\nEnter Opration\nPress 1 for PUSH\nPress 2 for POP\nPress 3 for Display\nPress 4 for PEEK\nPress 0 for EXIT\n");
        int c = sc.nextInt();
        int val;
        while (c >= 0) {
            switch (c) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Enter Element :- ");
                    val = sc.nextInt();
                    s.push(val);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    s.peek();
                    break;
                default:
                    System.out.println("Enter Right operation");
            }
            System.out.println(
                    "\nEnter Opration\nPress 1 for PUSH\nPress 2 for POP\nPress 3 for Display\nPress 4 for PEEK\nPress 0 for EXIT\n");
            c = sc.nextInt();
        }
    }
}
