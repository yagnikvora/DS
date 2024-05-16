import java.util.Arrays;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        if (areAnagrams(str1, str2))
            System.out.println("The entered strings are anagrams.");
        else
            System.out.println("The entered strings are not anagrams.");
        
    }
    
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        if (str1.length() != str2.length()) {
            return false;
        }
        
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        return Arrays.equals(charArray1, charArray2);
    }
}
