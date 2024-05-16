import java.util.*;

class CircularQueue {
    static int s;
    static int q[];
    static int front = -1;
    static int rear = -1;

    public static void enQueue(int element) {
        if ((front == 0 && rear == s - 1) || (front == rear + 1)) // front == ((rear+1)%s)
            System.out.println("Queue is full");
        else {
            rear = (rear + 1) % s;
            q[rear] = element;
            System.out.println("Insert " + element);
            if (front == -1)
                front = 0;
        }
    }

    public static int deQueue() {
        int element;
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            element = q[front];
            if (front == rear)
                front = rear = -1;
            else
                front = (front + 1) % s;
            System.out.println(element + " Deleted");
            return (element);
        }
    }

    public static void display() {
        if (front == -1) {
            System.out.println("Empty Queue");
            return;
        } else {
            System.out.println("\nFront index :- " + front);
            System.out.print("Items :- ");
            int i;
            for( i = front ; i!=rear ; i = (i+1)%s){
	            System.out.print(q[i]);
            }
            System.out.print(q[i]);
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
        q = new int[s];
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