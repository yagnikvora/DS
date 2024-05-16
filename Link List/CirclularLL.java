import java.util.*;

class CLinkedListMathodsex {
    Node first, last;

    public void insertAtFirst(int val) {
        Node newNode = new Node();
        newNode.data = val;
        if (first == null) {
            newNode.next = newNode;
            first = newNode;
            last = newNode;
            System.out.println("Node with data " + val + " is inserted at first");
        } else {
            newNode.next = first;
            last.next = newNode;
            first = newNode;
            System.out.println("Node with data " + val + " is inserted at first");
        }
    }

    public void insertAtLast(int val) {
        Node newNode = new Node();
        newNode.data = val;
        if (first == null) {
            newNode.next = newNode;
            first = newNode;
            last = newNode;
            System.out.println("Node with data " + val + " is inserted at last");

        } else {
            newNode.next = first;
            last.next = newNode;
            last = newNode;
            System.out.println("Node with data " + val + " is inserted at last");

        }
    }

    public void insord(int val) {
        Node newNode = new Node();
        newNode.data = val;
        if (first == null) {
            newNode.next = newNode;
            first = last = newNode;
            System.out.println("Node with data " + val + " is inserted");

        } else if (newNode.data <= first.data) {
            newNode.next = first;
            last.next = newNode;
            first = newNode;
            System.out.println("Node with data " + val + " is inserted");

        } else if (newNode.data >= last.data) {
            last.next = newNode;
            newNode.next = first;
            last = newNode;
            System.out.println("Node with data " + val + " is inserted");

        } else {
            Node save = first;
            while (save != last && newNode.data >= save.next.data)
                save = save.next;
            newNode.next = save.next;
            save.next = newNode;
            System.out.println("Node with data " + val + " is inserted");

        }
    }

    public void deleteAtFirst() {
        if (first == null) {
            System.out.println("List is empty");
        } else if (first == last) {
            System.out.println("First Node with data " + first.data + " is deleted");
            first = last = null;
        } else {
            System.out.println("First Node with data " + first.data + " is deleted");
            first = first.next;
            last.next = first;
        }
    }

    public void deleteAtLast() {
        if (first == null) {
            System.out.println("List id empty");
        } else if (first.next == first) {
            System.out.println("First Node with data " + first.data + " is deleted");
            first = last = null;
        } else {
            Node save = first;
            while (save.next != last) {
                save = save.next;
            }
            System.out.println("Last Node with data " + last.data + " is deleted");
            save.next = first;
            last = save;
        }
    }

    public void deleteValue(int val) {
        if (first == null) {
            System.out.println("List is empty");
        } else if (first.data == val) {
            if (first == last) {
                System.out.println("Node with data " + first.data + " is deleted");
                first = last = null;
            } else {
                System.out.println("Node with data " + first.data + " is deleted");
                first = first.next;
                last.next = first;
            }

        } else if (last.data == val) {
            Node save = first;
            while (save.next != last) {
                save = save.next;
            }
            System.out.println("Node with data " + last.data + " is deleted");
            save.next = first;
            last = save;
        } else {
            Node save = first;
            Node pred = new Node();
            while (save.data != val && save != last) {
                pred = save;
                save = save.next;
            }
            if (save.data != val)
                System.out.println("Node not found....");
            else {
                System.out.println("Node with data " + save.data + " is deleted");
                pred.next = save.next;
            }
        }
    }

    public void display() {
        if (first == null) {
            System.out.println("List is empty");
        } else {
            System.out.print(first.data + ",");
            Node save = first.next;
            while (save != first) {
                System.out.print(save.data + ",");
                save = save.next;
            }
        }
    }
}

class CirclularLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CLinkedListMathodsex l1 = new CLinkedListMathodsex();
        int c = 0;
        System.out.println(
                "\nPress 1 for Insert at Last\nPress 2 for Insert at First\nPress 3 for Insert in order\nPress 4 for Delete at Last\nPress 5 for Delete at First\nPress 6 for Delete at your Position\nPress 7 for Display\nPress 0 for Exit");
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
                    l1.insertAtLast(val);
                    break;
                case 2:
                    System.out.println("Enter value to insert");
                    val = sc.nextInt();
                    l1.insertAtFirst(val);
                    break;
                case 3:
                    System.out.println("Enter value to insert");
                    val = sc.nextInt();
                    l1.insord(val);
                    break;
                case 4:
                    l1.deleteAtLast();
                    break;
                case 5:
                    l1.deleteAtFirst();
                    break;
                case 6:
                    System.out.println("Enter value which you want to delete : ");
                    val = sc.nextInt();
                    l1.deleteValue(val);
                    break;
                case 7:
                    l1.display();
                    break;
                default:
                    System.out.println("Enter right operation!!");
            }
            System.out.println(
                    "\nPress 1 for Insert at Last\nPress 2 for Insert at First\nPress 3 for Insert in order\nPress 4 for Delete at Last\nPress 5 for Delete at First\nPress 6 for Delete at your Position\nPress 7 for Display\nPress 0 for Exit");
            c = sc.nextInt();
        }
    }
}