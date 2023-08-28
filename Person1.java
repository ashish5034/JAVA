import java.util.Scanner;
class Person{
	String name;
	double phone;
	int age;
	String gender;
		
	void showPerson()
	{
		System.out.println("------------------");
		System.out.println("Person name     "+name);
		System.out.println("person phone    "+phone);
		System.out.println("person age      "+age);
		System.out.println("person gender   "+gender);
		System.out.println("-----------------");
	}
	
	 double getPersonphone()
	{
		return phone;
	}
}
public class Person1
 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		Person p=new Person();
		p.name="Ashish M";
		p.phone=8484;
		p.age=22;
		p.gender="Male";
		
		
		p.showPerson();
		double phone=p.getPersonphone();
		System.out.println(phone);
		
		Person p1=new Person();
		System.out.println("Enter  name");
		p1.name=sc.next();
		System.out.println("Enter phone ");
	    p1.phone=sc.nextDouble();
		System.out.println("Enter age NO");
		p1.age=sc.nextInt();
		System.out.println("Enter Gender ");
		p1.gender=sc.next();
		
		p1.showPerson();
		
	}
}