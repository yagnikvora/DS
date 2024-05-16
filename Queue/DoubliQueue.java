import java.util.*;

class DoublyQueue {
    static int s;
    static int q[];
    static int front = -1, rear = -1;

    public static void lastenQueue(int element) {
        if (rear == s - 1)
            System.out.println("Queue is full");
        else {
            rear++;
            q[rear] = element;
            System.out.println("Insert " + element);
            if (front == -1)
                front = 0;
        }
    }

    public static void firstenQueue(int element) {
        if (front == 0) {
            System.out.println("Queue is full or Space not available at first!!");
            return;
        } else {
            if (front == -1) {
                front = rear = 0;
                q[front] = element;
                System.out.println("Insert " + element);
            } else {
                front--;
                q[front] = element;
                System.out.println("Insert " + element);
            }
        }
    }

    public static int firstdeQueue() {
        int element;
        if (front == -1) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = q[front];
            if (front == rear)
                front = rear = -1;
            else
                front++;
            System.out.println(element + " Deleted");
            return (element);
        }
    }

    public static int lastdeQueue() {
        int element;
        if (rear == -1) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            element = q[rear];
            if (rear == front)
                rear = front = -1;
            else
                rear--;
            System.out.println(element + " Deleted");
            return element;
        }
    }

    public static void display() {
        int i;
        if (front == -1) {
            System.out.println("Empty Queue");
            return;
        } else {
            System.out.println("\nFront index :- " + front);
            System.out.print("Items :- ");
            for (i = front; i <= rear; i++)
                System.out.print(q[i] + "  ");
            System.out.println("\nRear index :- " + rear);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of queue :- ");
        s = sc.nextInt();

        System.out.println(
                "Press 1 for Enqueue at last\nPress 2 for dequeue at first\nPress 3 for Enqueue at first\nPress 4 for dequeue at last\nPress 5 for Display\nPress 0 for exit");
        int c = sc.nextInt();
        q = new int[s];
        int val;
        while (c > 0) {
            switch (c) {
                case 1:
                    System.out.print("Enter element to insert in queue :- ");
                    val = sc.nextInt();
                    lastenQueue(val);
                    break;
                case 2:
                    firstdeQueue();
                    break;
                case 3:
                    System.out.print("Enter element to insert in queue :- ");
                    val = sc.nextInt();
                    firstenQueue(val);
                    break;
                case 4:
                    lastdeQueue();
                    break;
                case 5:
                    display();
                    break;
                default:
                    System.out.println("Enter Right operation");
            }
            System.out.println(
                    "Press 1 for Enqueue at last\nPress 2 for dequeue at first\nPress 3 for Enqueue at first\nPress 4 for dequeue at last\nPress 5 for Display\nPress 0 for exit");
            c = sc.nextInt();
        }
    }
}