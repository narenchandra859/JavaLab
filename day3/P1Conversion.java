package defPackage;
import NumberConversion.*;
import java.util.*;
public class P1Conversion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter\n1.Binary\n2.Octal\n3.Hex\n");
		int c = sc.nextInt();
		if(c==1) {
			System.out.println("\nBinary conversions");
			binaryConversion b = new binaryConversion();
			b.BinToDec();
			b.DecToBin();
		}
		else if(c==2) {
			System.out.println("\nOctal conversions");
			octalConversion o = new octalConversion();
			o.OctToDec();
			o.DecToOct();
		}
		else if(c==3) {
			System.out.println("\nHex conversions");
			hexConversion h = new hexConversion();
			h.HexToDec();
			h.DecToHex();
		}
		else {
			System.out.println("Invalid option.");
		}
	}
}
