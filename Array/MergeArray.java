import java.util.*;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of both array :- ");
        int size = sc.nextInt();
        
        int a[] = new int[size];
        int b[] = new int[size];
        int c[] = new int[size+size];
        int i,j;

        System.out.println("Enter elements of first array");
        for(i=0;i<size;i++){
            System.out.print("a["+i+"] :- ");
            a[i] = sc.nextInt();
            c[i] = a[i];
        }

        System.out.println("Enter elements of second array");
        for(j=0;j<size;j++){
            System.out.print("b["+j+"] :- ");
            b[j] = sc.nextInt();
            c[i+j] = b[j];
        }


        System.out.println("Merged Array is :- ");

        for(i=0; i<c.length; i++){
            System.out.println("c["+i+"]"+c[i]);
        }
    }
}
