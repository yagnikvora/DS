import java.util.*;

class QueuqLL {
    Node front, rear;

    public void enQueue(int a) {
        if (front == null) {
            Node newNode = new Node();
            newNode.data = a;
            newNode.next = null;
            front = newNode;
            rear = newNode;
            System.out.println(a + " is inserted");
        } else {
            Node newNode = new Node();
            newNode.data = a;
            newNode.next = null;
            rear.next = newNode;
            rear = newNode;
            System.out.println(a + " is inserted");
        }
    }

    public void deQueue() {
        if (front == null)
            System.out.println("Queue is empty");
        else {
            System.out.println(front.data + " is deleted");
            front = front.next;
        }
    }

    public void display() {
        if (front == null)
            System.out.println("Queue is empty");
        else {
            Node save = front;
            System.out.println();
            while (save != null) {
                System.out.print(save.data + ",");
                save = save.next;
            }
            // System.out.println(save.data);
        }
    }
}

public class QueuqUsingLL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueuqLL q = new QueuqLL();
        System.out.println(
                "\nEnter Opration\nPress 1 for ENQUEUE\nPress 2 for DEQUEUE\nPress 3 for DISPLAY\nPress 0 for EXIT");
        int c = sc.nextInt();
        int val;
        while (c >= 0) {
            switch (c) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Enter element :- ");
                    val = sc.nextInt();
                    q.enQueue(val);
                    break;
                case 2:
                    q.deQueue();
                    break;
                case 3:
                    q.display();
                    break;
                default:
                    System.out.println("Enter right operation");
                    break;
            }
            System.out.println(
                    "\nEnter Opration\nPress 1 for ENQUEUE\nPress 2 for DEQUEUE\nPress 3 for DISPLAY\nPress 0 for EXIT");
            c = sc.nextInt();
        }
    }
}
