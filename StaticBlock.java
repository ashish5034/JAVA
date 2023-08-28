class B{
	static {
		System.out.println("Static Block");
	}
	
	public B() {
	System.out.println("B Class Constructor");
	}
	
}

// Static Block Load at the time of class Loading
// static gets memory at the time of class loading'

public class StaticBlock {
	
	static {
		System.out.println("Static Block -- Class");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello ");
		
		B b1=new B();
	}

}
