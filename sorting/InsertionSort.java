public class InsertionSort {
    public static void sort(int[] a) {
        for(int i=1 ; i<a.length ; i++){
            int j = i-1;
            int temp = a[i];
            while(j >=0 && a[j]>temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 5, 8, 9, 11, 30 };
        // int arr[] = { 5,4,10,1,6,2 };

        sort(arr);

        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
