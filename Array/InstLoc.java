import java.util.*;

public class InstLoc {
    public static void main(String[] args) {
        int n, v, l;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array :- ");
        n = sc.nextInt();
        int a[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] :- ");
            a[i] = sc.nextInt();
        }

        System.out.print("Enter Location :- ");
        l = sc.nextInt();
        System.out.print("Enter Element :- ");
        v = sc.nextInt();

        for(int i = a.length - 2; i>=l; i--){
            a[i+1] = a[i];
        }
        a[l] = v;

        for(int i=0 ; i<=n ; i++){
            System.out.print(a[i]+",");
        }
    }
}
