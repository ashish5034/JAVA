import java.util.Scanner;
public class Student
 {
    public static void main(String a[])
    {
    	Scanner sc=new Scanner(System.in);
        int phy=70;
    int chem;
    int maths;
    int bio;
    System.out.println("Enter Chem Mark");
    chem=sc.nextInt();
    System.out.println("Enter Maths Mark");
    maths=sc.nextInt();
    System.out.println("Enter Physics Mark");
    phy=sc.nextInt();
    System.out.println("Enter Biology Mark");
    bio=sc.nextInt();
    System.out.println("Total Mark");
    int tot=phy+chem+maths+bio;
    System.out.println(tot);
    System.out.println("Average of Mark");
    int avg=tot/4;
    System.out.println(avg);
    }
    
}
