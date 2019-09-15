import java.util.*;

class Student_details {
	private String name;
	private int roll_no;
	private double subject[] = new double[4];
	Student_details(String name, int roll_no, double[] subject) {
		this.name = name;
		this.roll_no = roll_no;
		for(int i = 0; i<4; i++)
			this.subject[i]=subject[i];
	}
	public void calculateMarks() {
		double total = subject[0]+subject[1]+subject[2]+subject[3];
		System.out.println("Total marks = "+total);
	}
	public void calculateMarks(int A) {
                double total = subject[0]+subject[1]+subject[2]+subject[3];
                System.out.println("Total marks = "+(total+(total*A/100)));
        }
	public void calculateMarks(double B) {
                double total = subject[0]+subject[1]+subject[2]+subject[3];
                System.out.println("Total marks = "+(total+(total*B/100)));
        }
	public void calculateMarks(int A, double B) {
                double total = subject[0]+subject[1]+subject[2]+subject[3];
                System.out.println("Total marks = "+(total+(total*A/100)+(total*B/100)));
        }
}

public class P2Student {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student name, roll_no, 4 subject marks: ");
		String name = sc.nextLine();
		int roll_no = sc.nextInt();
		double subject[] = new double[4];
		for(int i = 0; i<4; i++) 
			subject[i] = sc.nextFloat();
		Student_details s = new Student_details(name, roll_no, subject); 
		int c;
		System.out.println("Did student participate in 1) Technical 2) Non-technical 3) Both? 4) None?: ");
		c=sc.nextInt();
		if(c==1)
			s.calculateMarks(8);
		else if(c==2)
			s.calculateMarks(4.5);
		else if(c==3)
			s.calculateMarks(8,4.5);
		else
			s.calculateMarks();
	}
}
