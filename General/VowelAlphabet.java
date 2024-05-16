import java.util.*;
public class VowelAlphabet {
    public static void main(String[] args) {
        char c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Character :- ");
        c = s.next().charAt(0);
        if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'){
            System.out.println("Entered Character is vowel");
        }
        else{
            System.out.println("Entered CHaracter is consonent");
        }

    }
}
