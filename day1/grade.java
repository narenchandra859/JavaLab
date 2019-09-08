import java.util.*;

public class grade {
	public static void main(String args[]) {
		System.out.println("Enter 2 subject marks: ");
		Scanner sc = new Scanner(System.in);
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		char x = gradecal.calculate(m1,m2);
		System.out.println("Grade = " + x);
	}
}

class gradecal {
	public static char calculate(int x, int y) {
		char res;
		if (x>=90 && y>=90) {
			res = 'A';
			return res;
		}
		return 'B';
	}
}
