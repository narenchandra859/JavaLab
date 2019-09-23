package quadRootFinder;
import java.lang.*;
public class findRoot {
	public void calcRoot(double a, double b, double c){
		double d = (b*b)-(4*a*c);
		double root1 = ((-b)+Math.sqrt(d))/(2*a);
		double root2 = ((-b)-Math.sqrt(d))/(2*a);
		System.out.println("Roots are: "+root1+" "+root2);
	}
}
