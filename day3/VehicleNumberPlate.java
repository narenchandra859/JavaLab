package VehicleCheck;

public class VehicleNumberPlate {
	public boolean checkNumPlate(String s) {
		int a1[] = {0,1,6,7};
		int a2[] = {4,5,9,10,11,12};
		for(int a: a1) {
			if(!Character.isLetter(s.charAt(a)))
				return false;
		}
		for(int a: a2) {
			if(Character.isLetter(s.charAt(a)))
				return false;
		}
		return true;
	}
}
