import java.util.*;

public class LSearch {
    public static int searchElement(int[] a, int val) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == val)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search : ");
        int val = sc.nextInt();
        int index = searchElement(arr, val);
        if (index == -1)
            System.out.println("element not found...");
        else
            System.out.println(val + " is found at " + (index + 1));
    }
}