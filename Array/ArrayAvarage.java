import java.util.*;
class ArrayAvarage{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0,s;
        float avg=0;
        System.out.print("Enter Array size :- ");
        s = sc.nextInt();
        int a[] = new int[s];
        
        for(int i = 0;i<s;i++){
            System.out.print("Enter a["+i+"] element :- ");
            a[i] = sc.nextInt();
        }
        
        for(int i = 0 ; i<s ; i++){
            sum = sum + a[i];
        }
        avg = (float)sum/(float)s;
        System.out.print("Avarage of Array is :- "+avg);
    }
}