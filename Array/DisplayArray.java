
import java.util.*;
class DisplayArray{
    public static void main (String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size :- ");
        n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter a["+i+"] element :- ");
            a[i] = s.nextInt();
        }
        System.out.print("\n\nArray elements are\n");
        for(int i = 0;i<n;i++){
            System.out.print("\nElement a["+i+"]:- "+a[i]);
        }
    }
}
