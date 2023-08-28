class Bird{
	int i=0;
	static int j=0;
	public Bird() {
	i++; j++;
	}
}
public class Test {
	
	public static void main(String[] args) {
		Bird b1=new Bird();
		Bird b2=new Bird();
		Bird b3=new Bird();
		
		System.out.println(b1.i);
		System.out.println(b2.i);
		System.out.println(b3.i);
		
		System.out.println(b1.j);  //3
		System.out.println(b2.j);  //3
		System.out.println(b3.j);  //3
		
		
	}

}
