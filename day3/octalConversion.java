package NumberConversion;
import java.util.Scanner;
public class octalConversion {
	public void OctToDec() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the octal number: ");
		String s = sc.nextLine();
		int n = Integer.parseInt(s, 8);
		System.out.println("\nDecimal number: "+n);
	}
	public void DecToOct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the decimal number: ");
		String s = sc.nextLine();
		int n = Integer.parseInt(s, 10); 
		s = Integer.toString(n, 8);
		System.out.println("\nOctal number: "+s);
	}
}