import java.util.*;

class Swap{
    static int a,b;
    public static void swapping(){
        
        int c = a;
        a = b;
        b = c;
        // int c[] = new int[2];
        // c[0] = b;
        // c[1] = a;
        // return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A :- ");
        a = sc.nextInt();
        System.out.print("Enter B :- ");
        b = sc.nextInt();
        swapping();
        System.out.println("A is "+a+" B is "+b);
        // int[] arr = swapping();
        // System.out.println("A is "+arr[0]+" B is "+arr[1]);
    }
}