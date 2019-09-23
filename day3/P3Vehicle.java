package defPackage;
import VehicleCheck.*;
import java.util.*;
public class P3Vehicle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vehicle number plate: ");
		String s = sc.nextLine();
		VehicleNumberPlate p = new VehicleNumberPlate();
		if(p.checkNumPlate(s))
			System.out.println("Valid number plate");
		else
			System.out.println("Invalid number plate");
	}
}
