package defPackage;
import quadRootFinder.*;
import java.util.*;
public class P2Quad {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coefficients: ");
		double a, b, c;
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		System.out.println("Calculating roots..");
		findRoot f = new findRoot();
		f.calcRoot(a, b, c);
	}
}
