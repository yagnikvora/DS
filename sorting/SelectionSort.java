public class SelectionSort {
    public static int[] sort(int[] a) {
        for(int i=0; i<a.length-1; i++){
            int min = i;
            for(int j =i+1; j<a.length;j++){
                if(a[min] > a[j]){
                    int temp = a[min];
                    a[min] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        // int arr[] = { 10, 20, 5, 8, 9, 11, 30 };
        int arr[] = { 7,4,10,8,3,1 };

        arr = sort(arr);

        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
