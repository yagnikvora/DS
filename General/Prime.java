import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name to check :- ");
        int a = sc.nextInt();
        int c = 0;
        for(int i=2; i <= (a/2); i++){
            if(a%i == 0)
                c = 0;
            else
                c = 1;
        }

        if(c == 1)
            System.out.println("Number is Prime");
        else
            System.out.println("Number is not Prime");
    }
}
