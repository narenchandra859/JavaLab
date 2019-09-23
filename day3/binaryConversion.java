package NumberConversion;
import java.util.*;
public class binaryConversion {
	public void BinToDec() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the binary number: ");
		String s = sc.nextLine();
		int n = Integer.parseInt(s, 2);
		System.out.println("\nDecimal number: "+n);
	}
	public void DecToBin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the decimal number: ");
		String s = sc.nextLine();
		int n = Integer.parseInt(s, 10); 
		s = Integer.toString(n, 2);
		System.out.println("\nBinary number: "+s);
	}
}