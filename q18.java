
	// Online Free Java compiler to run Java program online
import java.util.*;
	public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;
            for(int i=0;i<=n;i++) {
                sum += i;
            }
            System.out.println("Sum : "+sum);
		}
	}