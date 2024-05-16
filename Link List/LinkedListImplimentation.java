import java.util.*;

class LinkedListMathods {
    Node first;

    public void insert(int value) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;
        if (first == null)
            first = newNode;
        else {
            Node n = first;
            while (n.next != null) {
                n = n.next;
            }
            n.next = newNode;
        }
        System.out.println("\nNode with Data " + newNode.data + " is inserted at Last");
    }

    public void insertAtFirst(int value) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;
        if (first == null) {
            first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        System.out.println("\nNode with Data " + newNode.data + " is inserted at First");
    }

    public void insertAt(int value, int pos) {
        Node newNode = new Node();
        newNode.data = value;
        if (first == null) {
            first = newNode;
        } else {
            Node n = first;
            for (int i = 1; i < pos - 1; i++) {
                n = n.next;
            }
            Node n1 = n.next;
            n.next = newNode;
            newNode.next = n1;
            System.out.println("Node with Data " + newNode.data + "is inserted at " + pos);
        }
    }
    public void insord(int val){
        Node newNode = new Node();
        newNode.data = val;
        if(first == null){
            newNode.next = null;
        }else if(newNode.data <= first.data){
            newNode.next = first;
            first = newNode;
        }else{
            Node save = first;
            while(save.next != null && newNode.data >= save.next.data)
                save = save.next;
            newNode.next = save.next;
            save.next = newNode;
        }
    }
    public void delete() {
        if (first == null) {
            System.out.println("List is Empty");
        } else if (first.next == null) {
            System.out.println("\nLast Node " + first.data + " is deleted");
            first = null;
        } else {
            Node n = first;
            Node n1 = null;
            while (n.next != null) {
                n1 = n;
                n = n.next;
            }
            System.out.println("\nLast Node " + n.data + " is deleted");
            n1.next = null;
        }
    }

    public void deleteAtFirst() {
        if (first == null) {
            System.out.println("List is Empty");
            return;
        } else {
            System.out.println("\nFirst Node " + first.data + " is deleted");
            first = first.next;
        }
    }

    public void deleteAt(int pos) {
        if (first == null) {
            System.out.println("List is Empty!!");
        } else {
            Node n = first;
            for (int i = 1; i < pos - 1; i++) {
                n = n.next;
            }
            Node n1 = n.next;
            System.out.println("\n" + pos + " Location Node " + n1.data + " is deleted");
            n.next = n1.next;
        }
    }

    public void display() {
        if (first == null) {
            System.out.println("List is empty!");
        } else {
            Node n = first;
            while (n.next != null) {
                System.out.print(n.data + ",");
                n = n.next;
            }
            System.out.print(n.data + "\n");
        }
    }
}

class LinkedListImplimentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListMathods l1 = new LinkedListMathods();
        int c = 0;
        System.out.println("\nPress 1 for Insert at Last\nPress 2 for Insert at First\nPress 3 for Insert at your Location\nPress 4 for Insert in order\nPress 5 for Delete at Last\nPress 6 for Delete at First\nPress 7 for Delete at your Position\nPress 8 for Display\nPress 0 for Exit");
        c = sc.nextInt();
        int val, loc;
        while (c >= 0) {
            switch (c) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Enter value to insert");
                    val = sc.nextInt();
                    l1.insert(val);
                    break;
                case 2:
                    System.out.println("Enter value to insert");
                    val = sc.nextInt();
                    l1.insertAtFirst(val);
                    break;
                case 3:
                    System.out.println("Enter Location to insert Node : ");
                    loc = sc.nextInt();
                    System.out.println("Enter value to insert");
                    val = sc.nextInt();
                    l1.insertAt(val, loc);
                    break;
                case 4:
                    System.out.println("Enter value to insert");
                    val = sc.nextInt();
                    l1.insord(val);
                    break;
                case 5:
                    l1.delete();
                    break;
                case 6:
                    l1.deleteAtFirst();
                    break;
                case 7:
                    System.out.println("Enter loction which you want to delete : ");
                    loc = sc.nextInt();
                    l1.deleteAt(loc);
                    break;
                case 8:
                    l1.display();
                    break;
                default:
                    System.out.println("Enter right operation!!");
            }
            System.out.println("\nPress 1 for Insert at Last\nPress 2 for Insert at First\nPress 3 for Insert at your Location\nPress 4 for Insert in order\nPress 5 for Delete at Last\nPress 6 for Delete at First\nPress 7 for Delete at your Position\nPress 8 for Display\nPress 0 for Exit");
            c = sc.nextInt();
        }
    }
}