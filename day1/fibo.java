public class fibo{
	public static void main(String args[]){
		System.out.println("Enter limit: ");
		String s = System.console().readLine();
		int i = Integer.parseInt(s);
		fibo1.fiboo(i);
	}
}

class fibo1{ 
	public static void fiboo(int x) {
		int a=0, b=1, c;
		c = a + b;
		System.out.println(" " + a + " " + b);
		while(c<=x) {
			System.out.println(" " + c);
			a=b;
			b=c;
			c=a+b;
		}
	}
}
