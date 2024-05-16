import java.util.*;
class ArrayRange{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0,m,n,s;
        System.out.print("Enter Array size :- ");
        s = sc.nextInt();
        int a[] = new int[s];
        
        for(int i = 0;i<s;i++){
            System.out.print("Enter a["+i+"] element :- ");
            a[i] = sc.nextInt();
        }
        
        System.out.print("Enter Starting range :- ");
        m = sc.nextInt();
        System.out.print("Enter Ending range :- ");
        n = sc.nextInt();
        for(int i = m ; i<=n ; i++){
            sum = sum + a[i];
        }
        System.out.print("Sum from "+m+" to "+n+" is :- "+sum);
    }
}