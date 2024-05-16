import java.util.*;
class SmallPosition{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int s,min,minIndex;
        System.out.print("Enter Array size :- ");
        s = sc.nextInt();
        int a[] = new int[s];
        
        for(int i = 0;i<s;i++){
            System.out.print("Enter a["+i+"] element :- ");
            a[i] = sc.nextInt();
        }
        min = a[0];
        minIndex = 0;
        for(int i = 1; i< a.length ; i++){
                if (a[i] < min){
                    min = a[i];
                    minIndex = i;
                }
        }
        // int minValue = a[0];
        // int minIndex = 0;

        // for (int i = 1; i < a.length; i++) {
        //     if (a[i] < minValue) {
        //         minValue = a[i];
        //         minIndex = i;
        //     }
        // }
        System.out.print("smallest numbers position is :- "+(minIndex+1));
    }
}