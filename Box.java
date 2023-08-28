class Box {
	// Field OR instance Field
	int ht, wd, len;

	// instance Fuction
	void displayBox() {
		System.out.println(ht);
		System.out.println(wd);
		System.out.println(len);
	}

	// Instane Function
	int getVolOfBox() {
		return ht*wd*len;
	}

}

public class Test {

	public static void main(String[] args) {	
		Box  b1=new Box();
		b1.ht=11;
		b1.wd=11;
		b1.len=11;
		b1.displayBox();
		
		System.out.println("VOL");
		int vol=b1.getVolOfBox();
		System.out.println(vol);
	}

}
