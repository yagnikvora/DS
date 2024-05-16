import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int a,p,r=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. :-");
        a = s.nextInt();
        System.out.println("Enter power :-");
        p = s.nextInt();
        for(int i=1;i<=p;i++){
            r = r*a;
        }
        System.out.println("Power is :- "+r);
    }
}
