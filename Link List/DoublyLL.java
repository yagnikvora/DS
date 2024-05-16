import java.util.*;

class Dnode {
    Dnode rptr;
    int data;
    Dnode lptr;
}

class DoublyLLMathods {
    Dnode r, l;

    public void insertAtLast(int val) {
        Dnode newDnode = new Dnode();
        newDnode.data = val;
        if (l == null) {
            newDnode.lptr = newDnode.rptr = null;
            l = r = newDnode;
            System.out.println("Node with data " + val + " is inserted at last");
        } else {
            newDnode.lptr = r;
            newDnode.rptr = null;
            r.rptr = newDnode;
            r = newDnode;
            System.out.println("Node with data " + val + " is inserted at last");
        }
    }

    public void insertAtFirst(int val) {
        Dnode newDnode = new Dnode();
        newDnode.data = val;
        if (l == null) {
            newDnode.lptr = newDnode.rptr = null;
            l = r = newDnode;
            System.out.println("Node with data " + val + " is inserted at first");
        } else {
            newDnode.lptr = null;
            newDnode.rptr = l;
            l.lptr = newDnode;
            l = newDnode;
            System.out.println("Node with data " + val + " is inserted at first");
        }
    }

    public void insord(int val) {
        Dnode newDnode = new Dnode();
        newDnode.data = val;
        if (l == null) {
            newDnode.lptr = newDnode.rptr = null;
            l = r = newDnode;
            System.out.println("Node with data " + val + " is inserted");

        } else if (newDnode.data <= l.data) {
            newDnode.lptr = null;
            newDnode.rptr = l;
            l.lptr = newDnode;
            l = newDnode;
            System.out.println("Node with data " + val + " is inserted");

        } else {
            Dnode save = l;
            while (save.rptr != null && newDnode.data >= save.rptr.data)
                save = save.rptr;
            newDnode.rptr = save.rptr;
            save.rptr.lptr = newDnode;
            newDnode.lptr = save;
            save.rptr = newDnode;
            System.out.println("Node with data " + val + " is inserted");

        }
    }

    public void deleteAtLast() {
        if (l == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("Last Node with data " + r.data + " is deleted");
            r = r.lptr;
            r.rptr = null;
        }
    }

    public void deleteAtFirst() {
        if (l == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("First Node with data " + l.data + " is deleted");
            l = l.rptr;
            l.lptr = null;
        }
    }

    public void deleteSpecific(int val) {
        if (l == null) {
            System.out.println("List is empty");
        } else if (l == r) {
            System.out.println("Node with data " + l.data + " is deleted");
            l = r = null;
        } else if (l.data == val) {
            System.out.println("Node with data " + l.data + " is deleted");
            l = l.rptr;
            l.lptr = null;
        } else if (r.data == val) {
            System.out.println("Node with data " + r.data + " is deleted");
            r = r.lptr;
            r.rptr = null;
        } else {
            Dnode save = l;
            while (save.data != val && save.rptr != null)
                save = save.rptr;
            if (save.rptr == null)
                System.out.println("Node not found");
            else {
                System.out.println("Node with data " + save.data + " is deleted");
                save.lptr.rptr = save.rptr;
                save.rptr.lptr = save.lptr;
            }
        }
    }

    public void display() {
        if (l == null)
            System.out.println("List is empty");
        else {
            Dnode save = l;
            while (save != null) {
                System.out.print(save.data + ",");
                save = save.rptr;
            }
        }
    }
}

public class DoublyLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLLMathods d1 = new DoublyLLMathods();
        int c = 0;
        System.out.println(
                "\nPress 1 for Insert at Last\nPress 2 for Insert at First\nPress 3 for Insert in order\nPress 4 for Delete at Last\nPress 5 for Delete at First\nPress 6 for Delete with element\nPress 7 for Display\nPress 0 for Exit");
        c = sc.nextInt();
        int val;
        while (c >= 0) {
            switch (c) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Enter value to insert");
                    val = sc.nextInt();
                    d1.insertAtLast(val);
                    break;
                case 2:
                    System.out.println("Enter value to insert");
                    val = sc.nextInt();
                    d1.insertAtFirst(val);
                    break;
                case 3:
                    System.out.println("Enter Location to insert Node : ");
                    val = sc.nextInt();
                    d1.insord(val);
                    break;
                case 4:
                    d1.deleteAtLast();
                    break;
                case 5:
                    d1.deleteAtFirst();
                    break;
                case 6:
                    System.out.println("Enter element which you want to delete : ");
                    val = sc.nextInt();
                    d1.deleteSpecific(val);
                    break;
                case 7:
                    d1.display();
                    break;
                default:
                    System.out.println("Enter right operation!!");
            }
            System.out.println(
                    "\nPress 1 for Insert at Last\nPress 2 for Insert at First\nPress 3 for Insert in order\nPress 4 for Delete at Last\nPress 5 for Delete at First\nPress 6 for Delete with element\nPress 7 for Display\nPress 0 for Exit");
            c = sc.nextInt();
        }
    }
}
