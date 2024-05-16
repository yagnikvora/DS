import java.util.*;

class QueueImplementation {
    static int s;
    static int items[];
    static int front = -1, rear = -1;

    public static void enQueue(int element) {
        if (rear == s - 1)
            System.out.println("Queue is full");
        else {
            rear++;
            items[rear] = element;
            System.out.println("Insert " + element);
            if (front == -1)
                front = 0;
        }
    }

    public static int deQueue() {
        int element;
        if (front == -1) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front == rear)
                front = rear = -1;
            else
                front++;
            System.out.println(element + " Deleted");
            return (element);
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
                System.out.print(items[i] + "  ");
            System.out.println("\nRear index :- " + rear);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of queue :- ");
        s = sc.nextInt();

        // QueueImplementation q = new QueueImplementation(s);

        System.out.println("Press 1 for Enqueue\nPress 2 for dequeue\n");
        int c = sc.nextInt();
        items = new int[s];
        while (c > 0) {
            switch (c) {
                case 1:
                    System.out.print("Enter element to insert in queue :- ");
                    int v = sc.nextInt();
                    enQueue(v);
                    break;
                case 2:
                    deQueue();
                    break;
                case 3:
                    display();
                    break;
                default:
                    System.out.println("Enter Right operation");
            }
            System.out.println("\nPress 1 for Enqueue\nPress 2 for Dequeue\nPress 3 for Display\nPress 0 for exit");
            c = sc.nextInt();
        }
    }
}