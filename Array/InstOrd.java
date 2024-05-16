import java.util.*;

public class InstOrd {
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

        System.out.print("Enter Element :- ");
        v = sc.nextInt();

        for(int i = n-1; i>=0; i--){
            if(a[i] > v){
                a[i+1] = a[i];
                if(i == 0){
                    a[i] = v;  
                }
            }
            else{
                a[i+1] = v;
                break;
            }
        }

        System.out.print("Array is :- ");

        for(int i=0; i<=n; i++){
            System.out.print(a[i]+",");
        }
    }
}
