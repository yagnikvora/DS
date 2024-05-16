import java.util.*;
class SumOfArray{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0,n;
        System.out.print("Enter Array size :- ");
        n = sc.nextInt();
        int a[] = new int[n];
        
        for(int i = 0;i<n;i++){
            System.out.print("Enter a["+i+"] element :- ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter sarting index :- ");
        int m = sc.nextInt();
        for(int i = m ; i<n ; i++){
            sum = sum + a[i];
        }

        System.out.print("Avarage of Array is :- "+sum);
    }
}