import java.util.*;
import java.math.*;
class CircleArea{
    public static void main(String[] args) {
        float r;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of R :- ");
        r = s.nextFloat();
        System.out.println("Area of circle is "+(Math.PI*r*r));
    }
}