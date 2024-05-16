public class BubbleSort {
    public static void sort(int[] a) {
        for(int i = 0 ; i<a.length-1 ; i++){
            for(int j = 0 ; j<a.length-i-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
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
