import java.util.*;
public class fact{
	public static void main(String args[]){
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		fact(i);
	}
	public static void fact(int n) {
		int f = n;
		for(int i = 1; i<n; i++) {
			f = f*i;
		}
		System.out.println("Fact = " + f);
	}
}
