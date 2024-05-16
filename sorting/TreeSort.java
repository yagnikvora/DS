class Tnode {
    int data;
    Tnode lptr, rptr;
}

public class TreeSort {
    public static Tnode insert(Tnode root, int val) {
        if (root == null) {
            root = new Tnode();
            root.data = val;
            root.lptr = root.rptr = null;
            return root;
        }
        if (val < root.data)
            root.lptr = insert(root.lptr, val);
        else
            root.rptr = insert(root.rptr, val);
        return root;
    }

    public static void sort(Tnode root) {
        if (root != null){
            sort(root.lptr);
            System.out.print(root.data + ",");
            sort(root.rptr);
        }
    }

    public static void main(String[] args) {
        Tnode root = null;
        int arr[] = { 10, 20, 5, 8, 9, 11, 30 };
        // int arr[] = { 15, 16, 6, 8, 5 };

        for (int a : arr) 
            root = insert(root, a);
        
        sort(root);
    }
}
