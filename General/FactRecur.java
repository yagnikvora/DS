import java.util.*;

public class FactRecur {
    static int fact(int n){
        if(n == 1)
            return 1;
        else    
            return (n*fact(n-1)); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find fectorial :- ");
        int a = sc.nextInt();
        System.out.println("Factorial is :- "+fact(a));
    }
}
