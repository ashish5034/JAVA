import java.util.Scanner;
class Employee{
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    public Employee(){
        

    }
    Employee(int id ,String firstName,String lastName,int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;

    }
    void setId(int id){
        this.id=id;
    }
    int getId(){
        return id;
    }
    void setName(String firstName)
    {
        this.firstName=firstName;
    }
    String getName(){
        return firstName;
    }
    void setLastName(String lastName)
    {
        this.lastName=lastName;

    }
    String getLastName()
    {
        return lastName;
    }
    void setSalary(int salary)
    {
        this.salary=salary;
    }
    int getSalary()
    {
        return salary;
    }

    void showData() {
		System.out.println("Employee Id          "+id);
		System.out.println("Employee First name  " +firstName);
		System.out.println("Employee last name   " +lastName);
        System.out.println("Employee Salary      "+salary);
	}

}
public class Employee1 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        Employee e=new Employee(1,"Ashish","Mahamuni",150000);

        /*System.out.println("Enter Enployee ID     ");
        e.id=sc.nextInt();
       System.out.println("Enter Enployee name     ");
       e.firstNamename=sc.next();
       System.out.println("Enter Enployee Lst name     ");
       e.lastName=sc.next();
       System.out.println("Enter Enployee Salary     ");
       e.salary=sc.nextInt();*/
        e.showData();

        e.setId(12);
        int id=e.getId();
        System.out.println(id);

        e.setName("Ashish");
        String firstName=e.getName();
        System.out.println(firstName);

        e.setLastName("Mahamuni");
        String LastName=e.getLastName();
        System.out.println(LastName);

        e.setSalary(15000);
        int salary=e.getSalary();
        System.out.println(salary);
    }
}
