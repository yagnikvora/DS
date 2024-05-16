import java.util.*;

class MatrixMul{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][2];
        int b[][] = new int[2][3];
        int res[][] = new int[3][3];


        System.out.print("Enter first array elemets \n\n");
        for(int i=0; i<a.length; i++){
            for(int j = 0; j<a[0].length; j++){
                System.out.print("Enter a["+i+"]["+j+"] : -");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("\n\nEnter second array elemets \n\n");
        for(int i=0; i<b.length; i++){
            for(int j = 0; j<b[0].length; j++){
                System.out.print("Enter b["+i+"]["+j+"] : -");
                b[i][j] = sc.nextInt();
            }
        }
          
        if(a[0].length != b.length){
            System.out.println("Multiplication is not posiible!!");
            System.exit(0);
        }

        for(int i =0; i<a.length; i++){
            for(int j =0; j<b[0].length; j++){
                for(int k =0; k<a[0].length; k++){
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Multiplication of two Matrix");
        for(int i = 0; i<res.length; i++){
            for(int j = 0; j<res[0].length; j++){
                System.out.print(res[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
