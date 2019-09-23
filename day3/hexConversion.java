package NumberConversion;
import java.util.Scanner;
public class hexConversion {
	public void HexToDec() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the hex number: ");
		String s = sc.nextLine();
		int n = Integer.parseInt(s, 16);
		System.out.println("\nDecimal number: "+n);
	}
	public void DecToHex() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the decimal number: ");
		String s = sc.nextLine();
		int n = Integer.parseInt(s, 10); 
		s = Integer.toString(n, 16);
		System.out.println("\nHex number: "+s);
	}
}