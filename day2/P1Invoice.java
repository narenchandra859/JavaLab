import java.util.*;

class Invoice {
	private int item_id=0;
	private String item_name="DEFAULT";
	private int item_type=1;
	private int item_quantity=0;
	private double item_price=0.0;
	public void setDetails() {
		System.out.println("Enter item id, name, type, quantity and price: ");
		Scanner s = new Scanner(System.in);
		item_id = s.nextInt();
		s.nextLine();
		item_name = s.nextLine();
		item_type = s.nextInt();
		item_quantity = s.nextInt();
		item_price = s.nextFloat();
	}
	public void getDetails() {
		System.out.println("ID: "+item_id+"\nName: "+item_name+"\nType: "+item_type);
		System.out.println("Quantity: "+item_quantity+"\nPrice: "+item_price);
	}
	private double calculateTax(int item_type,double item_price) {
	 	double GST[] = new double[]{0.0, 0.05, 0.12, 0.18, 0.24};
		return(item_quantity*(item_price*GST[item_type]));
	}
	public void printInvoice() {
		getDetails();
		System.out.println("Total tax = "+calculateTax(item_type, item_price));
		System.out.println("Total price = "+((item_price*item_quantity)+calculateTax(item_type, item_price)));
	}
}

public class P1Invoice {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of items: ");
		n = sc.nextInt();
		System.out.println("Enter details of items: ");
		Invoice items[] = new Invoice[n];
		for(int i = 0; i<n; i++) {
			items[i] = new Invoice(); 
			items[i].setDetails();
		}
		System.out.println("\n\nINVOICE");
		for(int i = 0; i<n; i++)
			items[i].printInvoice();
	}
}
