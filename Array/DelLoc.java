import java.util.*;

public class DelLoc {
    public static void main(String[] args) {
        int n, v, l;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array :- ");
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] :- ");
            a[i] = sc.nextInt();
        }

        System.out.print("Enter Location :- ");
        l = sc.nextInt();

        for(int i = l; i<a.length-1 ; i++){
            a[i] = a[i+1];
        }
        for(int i=0 ; i<n-1 ; i++){
            System.out.print(a[i]+",");
        }
    }
}