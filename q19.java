import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean a = false;
        for(int i=2;i<=n-1;i++) {
            if(n%i==0) {
                a = true;
            }
        }
        if(a==false) {
            System.out.println(n+" is a prime number");
        } else{
            System.out.println(n+" is not a prime number");
        }
    }
}