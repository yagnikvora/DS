import java.util.*;

class Tnode {
    int data;
    Tnode lptr, rptr;
}

class BST {
    public Tnode insert(Tnode root, int val) {
        if (root == null) {
            root = new Tnode();
            root.data = val;
            root.lptr = root.rptr = null;
            System.out.println("Node with data " + root.data + " is inserted");
            return root;
        }
        if (root.data == val)
            System.out.println("Node already available in BST");
        if (val < root.data)
            root.lptr = insert(root.lptr, val);
        else
            root.rptr = insert(root.rptr, val);
        return root;
    }

    public boolean delete(Tnode root, int data) {
        Tnode ptr = root;
        Tnode preptr = ptr;
        // To find node
        while (ptr != null && ptr.data != data) {
            preptr = ptr;
            if (data < ptr.data)
                ptr = ptr.lptr;
            else
                ptr = ptr.rptr;
        }
        // To delete node
        if (ptr != null && ptr.data == data) {
            // posibility--1
            if (ptr.lptr == null && ptr.rptr == null) {
                if (ptr == root) {
                    root = null;
                } else {
                    if (preptr.lptr == ptr)
                        preptr.lptr = null;
                    else
                        preptr.rptr = null;
                }
            }
            // posibility--2
            else if (ptr.rptr == null) {
                if (ptr == root)
                    root.lptr = null;
                else {
                    if (preptr.lptr == ptr)
                        preptr.lptr = ptr.lptr;
                    else
                        preptr.rptr = ptr.lptr;
                }
            }
            // posibility--3
            else if (ptr.lptr == null) {
                if (ptr == root)
                    root.rptr = null;
                else {
                    if (preptr.lptr == ptr)
                        preptr.lptr = ptr.rptr;
                    else
                        preptr.rptr = ptr.rptr;
                }
            }
            // posibility--4
            else {
                Tnode t = ptr.rptr;
                while (t.lptr != null)
                    t = t.lptr;
                int tmp = t.data;
                delete(ptr, t.data);
                ptr.data = tmp;
            }
            return true;
        } else {
            return false;
        }
    }

    // public Tnode delete(Tnode root, int data) {
    // if (root == null)
    // return root;
    // if (data < root.data)
    // root.lptr = delete(root.lptr, data);
    // else if (data > root.data)
    // root.rptr = delete(root.rptr, data);
    // else {
    // // Posibility 1
    // if (root.lptr == null && root.rptr == null) {
    // return null;
    // }
    // // Posibility 2
    // if (root.lptr == null)
    // return root.rptr;
    // else if (root.rptr == null)
    // return root.lptr;

    // // Posibility 3
    // Tnode insuc = successor(root.rptr);
    // root.data = insuc.data;
    // root.rptr = delete(root.rptr, insuc.data);
    // }
    // return root;
    // }

    public Tnode successor(Tnode root) {
        while (root.lptr != null)
            root = root.lptr;
        return root;
    }

    public void inorder(Tnode root) {
        if (root != null) {
            inorder(root.lptr);
            System.out.print(root.data + ",");
            inorder(root.rptr);
        }
    }

    public void preorder(Tnode root) {
        if (root != null) {
            System.out.print(root.data + ",");
            preorder(root.lptr);
            preorder(root.rptr);
        }
    }

    public void postorder(Tnode root) {
        if (root != null) {
            postorder(root.lptr);
            postorder(root.rptr);
            System.out.print(root.data + ",");
        }
    }
}

public class BSTTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BST t = new BST();
        Tnode root = null;
        System.out.println(
                "\nPress 1 for insert\nPress 2 for delete\nPress 3 for preorder traversal\nPress 4 for inorder traversal\nPress 5 for postorder traversal\nPress 0 for exit");
        int c = sc.nextInt();
        int val;
        while (c >= 0) {
            switch (c) {
                case 1:
                    System.out.print("Enter element :- ");
                    val = sc.nextInt();
                    root = t.insert(root, val);
                    break;
                case 2:
                    System.out.println("Enter element :- ");
                    val = sc.nextInt();
                    if (t.delete(root, val))
                        System.out.println("Node with " + val + " is deleted");
                    else
                        System.out.println("Node not found");
                    break;
                // case 2:
                // System.out.print("Enter element :- ");
                // val = sc.nextInt();
                // root = t.delete(root, val);
                // break;
                case 3:
                    t.preorder(root);
                    break;
                case 4:
                    t.inorder(root);
                    break;
                case 5:
                    t.postorder(root);
                    break;
                default:
                    System.out.println("Enter right choice");
                    break;
            }
            System.out.println(
                    "\nPress 1 for insert\nPress 2 for delete\nPress 3 for preorder traversal\nPress 4 for inorder traversal\nPress 5 for postorder traversal\nPress 0 for exit");
            c = sc.nextInt();
        }
    }
}