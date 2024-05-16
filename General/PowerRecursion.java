import java.util.Scanner;

public class PowerRecursion {
    public static int Power(int n,int p){
        if(p == 0){
            return 1;
        }else{
            return (n * Power(n, p-1));
        }
    }
    public static void main(String[] args) {
        int a,p,r=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. :-");
        a = s.nextInt();
        System.out.println("Enter power :-");
        p = s.nextInt();
        r = Power(a,p);
        System.out.println("Power is :- "+r);
        s.close();
    }
}
