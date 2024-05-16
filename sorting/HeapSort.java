public class HeapSort {
    public static void maxHipify(int[] a, int n, int i) {
        int large = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;

        if (l < n && a[l] > a[large])
            large = l;

        if (r < n && a[r] > a[large])
            large = r;

        if (large != i) {
            int temp = a[large];
            a[large] = a[i];
            a[i] = temp;
            maxHipify(a, n, large);
        }
    }

    public static void sort(int[] a) {
        int len = a.length;
        for (int i = (len / 2) - 1; i >= 0; i--) {
            maxHipify(a, len, i);
        }
        for (int i = len - 1; i >= 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            maxHipify(a, i, 0);
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 5, 2, 0, 4, 2, 5, 2, 1, 5 };
        int arr[] = { 5, 4, 10, 1, 6, 2 };

        sort(arr);

        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
