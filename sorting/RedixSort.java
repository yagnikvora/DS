import java.util.Arrays;

public class RedixSort {
    
    public static int[] sort(int[] a){
        int max = Arrays.stream(a).max().getAsInt();
        for(int p = 1 ; (max/p) > 0; p = p*10){
            a = count(a,p);
        }
        return a;
    }

    public static int[] count(int[] a,int p){
        int[] c = new int[10];
        int[] b = new int[a.length];
        Arrays.fill(c,0);
        for(int i = 0;i<a.length;i++){
            c[(a[i]/p)%10]++;
        }
        for(int i = 1; i<c.length;i++){
            c[i] += c[i-1]; 
        }
        for(int i=a.length-1;i>=0;i--){
            b[--c[(a[i]/p)%10]] = a[i];
        }
        return b;
    }
    
    public static void main(String[] args) {
        // int arr[] = { 1,5,2,0,4,2,5,2,1,5 };
        int arr[] = { 5,4,10,1,6,2 };

        arr = sort(arr);

        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
