import java.util.*;

public class MatrixSum {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Elements of first array ");
        for(int i =0; i<2;i++){
            for(int j =0; j<2; j++){
                System.out.print("Enter a["+i+"]["+j+"] :- ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Elements of second array ");

        for(int i =0; i<2;i++){
            for(int j =0; j<2; j++){
                System.out.print("Enter b["+i+"]["+j+"] :- ");
                b[i][j] = sc.nextInt();
                c[i][j] = a[i][j] + b[i][j];
            }
        }


        System.out.println("Sum of two metrix is");

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
