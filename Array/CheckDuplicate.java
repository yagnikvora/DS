import java.util.*;
class CheckDuplicate{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int s,c=0;
        System.out.print("Enter Array size :- ");
        s = sc.nextInt();
        int a[] = new int[s];
        
        for(int i = 0;i<s;i++){
            System.out.print("Enter a["+i+"] element :- ");
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<s ; i++){
            for(int j=i+1; j<s;j++){
                if (a[i] == a[j]){
                   c++;
                   break;
                }
            }
        }
        if(c == 1)
            System.out.print("Array contains duplicate values");
        else
            System.out.print("Array doesn't contains duplicate values");
    }
}