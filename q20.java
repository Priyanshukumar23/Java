import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        int l = arr[0];
        for(int i=0;i<n;i++) {
            if(arr[i]>l) {
                l = arr[i];
            }
        }
        System.out.println("largest element: "+l);
    }
}