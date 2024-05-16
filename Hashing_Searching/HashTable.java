import java.util.*;

class HashTable {
    public static int hash(int a, int size) {
        return a % size;
    }

    public static int search(int val, int[] hashArray) throws Exception {
        int index = hash(val, hashArray.length);
        if (hashArray[index] == val) {
            return index;
        } else {
            int temp = index + 1;
            if (temp == hashArray.length)
                temp = 0;
            while (temp != index) {
                if (hashArray[temp] == val)
                    return temp;
                else {
                    if (temp == hashArray.length - 1)
                        temp = 0;
                    else
                        temp++;
                }
            }
            throw new Exception("Element not found");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = 10;
        int hashArray[] = new int[size];
        int h[] = { 13, 10, 15, 12, 18, 2, 1, 4 };// new int[size];
        Arrays.fill(hashArray, 0);
        for (int i = 0; i < h.length; i++) {
            int index = hash(h[i], size);
            if (hashArray[index] == 0) {
                hashArray[index] = h[i];
            } else {
                int temp = index + 1;
                if (temp == size)
                    temp = 0;
                while (temp != index) {
                    if (hashArray[temp] == 0) {
                        hashArray[temp] = h[i];
                        break;
                    } else {
                        if (temp == size - 1)
                            temp = 0;
                        else
                            temp++;
                    }
                    if (temp == index) {
                        System.out.println("Hash table is full.......");
                        break;
                    }
                }
            }
        }
        int s;
        System.out.print("Enter element for search :- ");
        s = sc.nextInt();
        int in = search(s, hashArray);
        System.out.println(s + " is found at " + in);
    }
}