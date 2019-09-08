public class Program1 {
	public static void display() {
		System.out.println("Program1 static fn");
	}
	public static void main(String args[]) {
		System.out.println("In program1");
		display();
		Program2 obj = new Program2();
		obj.display1();
		Program2.display1();
	}
}

class Program2 {
	public static void display1() {
		System.out.println("Program2 static fn");
	}
}
	
