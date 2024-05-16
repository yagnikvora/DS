import java.util.*;

public class BSearch {
    public static int searchElement(int[] a, int val) {
        int left = 0;
        int right = a.length - 1;
        int mid;
        while (right >= left) {

            mid = (left + right) / 2;
            if (a[mid] == val)
                return mid;
            else if (a[mid] < val)
                left = mid + 1;
            else if (a[mid] > val)
                right = mid - 1;

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
