import java.util.Scanner;

class Laptop{
    String brand;
    int price;
    String color;
    void showLaptop()
    {
        System.out.println("***********************");
        System.out.println("Band         "+brand);
        System.out.println("price        "+price);
        System.out.println("color        "+color);
        System.out.println("***********************");
    }
    int getLaptopPrice(){
        return price;
    }
    String getLaptopBrand(){
        return brand;
    }
    
}
public class Laptop1 {
    public static void main(String [] args)
{
    Laptop l=new Laptop();
    l.brand="HP";
    l.price=35000;
    l.color="SILVER";
    l.showLaptop();
    
    Scanner sc=new Scanner(System.in);
Laptop l1=new Laptop();
System.out.println("Enter Brand name");
l1.brand=sc.next();
System.out.println("Enter Price");
l1.price=sc.nextInt();
System.out.println("Enter Color");
l1.color=sc.next();
System.out.println("***********************");
System.out.println("Show Laptop Details");
l1.showLaptop();
System.out.println("***********************");
int price=l.getLaptopPrice();
System.out.println("Laptop Price           "+price);
String brand=l.getLaptopBrand();
System.out.println("Laptop Brand           "+brand);
}    
}
