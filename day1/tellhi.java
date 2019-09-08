public class tellhi{
	public static void main(String args[]) {
		System.out.println("Tell hi");
		String s;
		s=System.console().readLine();
		if ( s.equals("hi") ) {
			System.out.println("Hello");
		}
		else {
			System.out.println("No");
		}
	}
}

