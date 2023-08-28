class A{
	int x=11;
	static int y=22;

	// Instance Function can access Both Static and non -static field
	void display() {
		System.out.println("X  "+x + "  Y"+y);
	}
	
	static void print() {
		System.out.println( "  Y"+y);
		// Here non static field can not access in static context
	}

}


public class Demo {
	
	public static void main(String[] args) {
		
		A a1=new A();
		a1.display();
	// want to call function without creating Object	
		A.print();
		
	}

}
