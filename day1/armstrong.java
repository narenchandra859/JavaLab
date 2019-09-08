import java.util.*;

public class armstrong {
	public static void main(String args[]) {
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		boolean c = arm.cal(x);
		System.out.println(c);
	}
}

class arm {
	public static boolean cal(int x) {
		int a = x, c, sum = 0;
		while(a!=0) {
			c=a%10;
			sum = sum + (c*c*c);
			a=a/10;
		}
		if(sum == x)
			return true;
		else
			return false;
	}
}
