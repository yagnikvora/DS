public class MergeSort {
    static int b[];
    public static int[] sort(int a[], int lb, int ub) {
        if (lb < ub) {
            int mid = (lb+ub)/2;
            sort(a, lb, mid);
            sort(a, mid + 1, ub);
            marge(a, lb, mid, ub);
        }
        return a;
    }

    public static void marge(int[] a, int lb, int mid, int ub) {
        int i = lb;
        int j = mid+1;
        int k = lb;
        while(i<=mid && j<=ub){
            if(a[i]<=a[j]){
                b[k] = a[i];
                i++;
            }else{
                b[k] = a[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=ub){
                b[k] = a[j];
                k++;j++;
            }
        }else{
            while(i<=mid){
                b[k] = a[i];
                k++;i++;
            }
        }
        for(int y=0;y<k; y++)
            a[y] = b[y];
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 5, 8, 9, 11, 30 };
        // int arr[] = { 7, 6, 10, 5, 9, 2, 1, 15, 7 };
        b = new int[arr.length];

        sort(arr, 0, arr.length-1);

        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
