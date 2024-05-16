import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {
    public static void sort(int[] a) {
        int max = Arrays.stream(a).max().getAsInt();

        ArrayList<Integer> buckets[] = new ArrayList[10];

        for(int i=0; i<buckets.length ; i++){
            buckets[i] = new ArrayList<Integer>();
        }
        
        for(int i = 0 ;i<a.length ; i++ ){
            buckets[a[i]/10].add(a[i]);
        }

        for(int i=0 ; i<buckets.length ; i++){
            Collections.sort(buckets[i]);
        }

        int index = 0;
        for(int i =0; i<buckets.length; i++){
            for(int j = 0; j<buckets[i].size() ; j++){
                a[index++] = buckets[i].get(j);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 5, 8, 9, 11, 30 };
        // int arr[] = { 7, 4, 10, 8, 3, 1 };

        sort(arr);

        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
