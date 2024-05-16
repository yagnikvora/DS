
public class ShellSort {
    
    public static void sort(int[] a,int n){
        for(int gap = n/2;gap>=1;gap = gap/2){
            for(int j = gap; j<n; j++){
                for(int i = j-gap; i>=0 ; i = i-gap){
                    if(a[i+gap] > a[i])
                        break;
                    else{
                        int temp = a[i];
                        a[i] = a[i+gap];
                        a[i+gap] = temp;
                    }
                }
            }
        }

    }
    
    public static void main(String[] args) {
        // int arr[] = { 1,5,2,0,4,2,5,2,1,5 };
        int arr[] = { 5,4,10,1,6,2 };

        sort(arr,arr.length);

        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
