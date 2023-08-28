import java.util.Scanner;
class Room{
	String Add;
	double BHK;
	int pin;
	String color;
		
	void showRoom()
	{
		System.out.println("------------------");
		System.out.println("Address "+  Add);
		System.out.println("How many room    "+BHK);
		System.out.println("Pin code no "+pin);
		System.out.println("Room Color    "+color);
		System.out.println("-----------------");
	}
	
	 double getRoomBHK()
	{
		return BHK;
	}
}
public class Room1
 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		Room r=new Room();
		r.Add="SONY";
		r.BHK=25000;
		r.pin=1111;
		r.color="RED";
		
		
		r.showRoom();
		double BHK=r.getRoomBHK();
		System.out.println(BHK);
		
		Room r1=new Room();
		System.out.println("Enter address name");
		r1.Add=sc.next();
		System.out.println("Enter many room  ");
		r1.BHK=sc.nextDouble();
		System.out.println("Enter pin NO");
		r1.pin=sc.nextInt();
		System.out.println("EnterRoom Color ");
		r1.color=sc.next();
		
		r1.showRoom();
		
	}
}