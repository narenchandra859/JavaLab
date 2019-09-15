import java.util.*;

class Car {
	String car_name, car_model, car_color;
	Car(String cn, String cm, String cc) {
		car_name = cn;
		car_model = cm;
		car_color = cc;
	}
	public void speed() {
		System.out.println("Car is going at 50.00 KMPH");
	}
        public void printdetails()
	{	
		System.out.println("Car name :"+car_name);
		System.out.println("Car model :"+car_model);
		System.out.println("Car color :"+car_color);
	}
}

class FamilyCar extends Car
{
	int num_seats, num_doors;
	double car_price;
	FamilyCar(String name, String model, String color,int seats,int doors,double p) {
		super(name, model, color);
		num_seats=seats;
		num_doors=doors;
		car_price=p;
	}
	public void speed()
	{
		System.out.println("Car is going at 30.00 KMPH");
	}
	public void printdetails()
	{	System.out.println("Family car details");
		super.printdetails();
		System.out.println("Car doors :"+num_doors);
		System.out.println("Car seats :"+num_seats);
		System.out.println("Car price :"+car_price);
	}
}

class SportsCar extends Car
{
	int num_seats, num_doors;
	double car_price;
	SportsCar(String name, String model, String color,int seats,int doors,double p) {
		super(name, model, color);
		num_seats=seats;
		num_doors=doors;
		car_price=p;
	}
	public void speed()
	{
		System.out.println("Car is going at 90.00 KMPH");
	}
	public void printdetails()
	{	System.out.println("Sports car details");
		super.printdetails();
		System.out.println("Car doors :"+num_doors);
		System.out.println("Car seats :"+num_seats);
		System.out.println("Car price :"+car_price);
	}
}
public class P3Car {
	public static void main(String args[]) {
            FamilyCar F=new FamilyCar("FamCarA","ModelA","RED",6,4,500000.0);
            SportsCar S=new SportsCar("SportCarB","ModelB","BLUE",4,2,1000000.0);
            F.printdetails();
            System.out.println("Family car speed: ");
            F.speed();
            S.printdetails();
            System.out.println("Family car speed: ");
            S.speed();
	}
}
