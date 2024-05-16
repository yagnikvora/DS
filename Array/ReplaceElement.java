import java.util.*;
class ReplaceElement{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int s,a1,b;
        System.out.print("Enter Array size :- ");
        s = sc.nextInt();
        int a[] = new int[s];
        
        for(int i = 0;i<s;i++){
            System.out.print("Enter a["+i+"] element :- ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter value of A :- ");
        a1 = sc.nextInt();
        System.out.print("Enter value of B :- ");
        b = sc.nextInt();
        
        for(int i = 0; i< s; i++){
            if(a[i] == a1){
                a[i] = b;
                System.out.print((i+1)+" position changed.\n");
            }
        }
        System.out.println("Array elements are.");
        for(int i =0; i<s; i++){
            System.out.println("a["+i+"] : "+a[i]);
        }
    }   
        
}