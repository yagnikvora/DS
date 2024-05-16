import java.util.Arrays;

public class CountingSort {
    
    public static int[] sort(int[] a){
        int max = a[0];
        int c[] = new int[a.length];
        for(int i=1;i<a.length;i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        int b[] = new int[max+1];
        Arrays.fill(b,0);
        for(int i=0;i<a.length;i++)
            b[a[i]]++;
        
        for(int i=1;i<b.length;i++)
            b[i] += b[i-1];
        
        for(int i=a.length-1;i>=0;i--){
            c[--b[a[i]]]= a[i];
        }

        return c;
    }
    
    public static void main(String[] args) {
        int arr[] = { 1,5,2,0,4,2,5,2,1,5 };
        // int arr[] = { 5,4,10,1,6,2 };

        arr = sort(arr);

        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
