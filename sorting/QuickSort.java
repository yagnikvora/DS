public class QuickSort {

    public static int[] sort(int a[], int lb, int ub) {
        if (lb < ub) {
            int index = partiton(a, lb, ub);
            sort(a, lb, index - 1);
            sort(a, index + 1, ub);
        }
        return a;
    }

    public static int partiton(int[] a, int lb, int ub) {
        int start = lb;
        int end = ub;
        int pivot = a[lb];
        while (start < end) {
            while (start<a.length && a[start] <= pivot)
                start++;
            while (end>=0 && a[end] > pivot )
                end--;

            if (start < end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        int temp = a[end];
        a[end] = a[lb];
        a[lb] = temp;

        return end;
    }

    public static void main(String[] args) {
        // int arr[] = { 10, 20, 5, 8, 9, 11, 30 };
        int arr[] = { 7, 6, 10, 5, 9, 2, 1, 15, 7 };
        int upb = arr.length - 1;
        arr = sort(arr, 0, upb);

        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
