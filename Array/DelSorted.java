import java.util.*;

public class DelSorted {
    public static void main(String[] args) {
        int n,v;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array :- ");
        n = sc.nextInt();
        int a[] = new int[n+1];
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"] :- ");
            a[i] = sc.nextInt();
        }

        System.out.print("Enter Element to delete :- ");
        v = sc.nextInt();

        for(int i = 0; i<n; i++){
            if(a[i] >= v){
                a[i] = a[i+1];
            }
        }

        System.out.print("Array is :- ");

        for(int i=0; i<n-1; i++){
            System.out.print(a[i]+",");
        }
    }
}

