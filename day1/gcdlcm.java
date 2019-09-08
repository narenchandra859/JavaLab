import java.util.*;

public class gcdlcm {
	public static void main(String args[]) {
		System.out.println("Enter 2 num: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		cal(x,y);
	}
	public static void cal(int x, int y) {
		int rem = 1, n=x, m=y;
		while(rem!=0) {
			rem = x%y;
			x = y;
			y = rem;
		}
		int g = x;
		int lcm = (n*m)/g;
		System.out.println("GCD = " + g + " LCM = " + lcm);
	}
}

