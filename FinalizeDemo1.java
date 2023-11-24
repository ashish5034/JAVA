class FinalizeDemo1
{
    public static void main(String[] args) {
        Employee eobj = new Employee("Ashish", 80000, 24, "Baramati,Pune");
        eobj.Display();
        eobj = null;
        System.gc();//garbage collector
    }
}
class Employee
{
    public String Name;
    public int Salary;
    public int Age;
    public String Address;

    Employee(String str, int amount, int A, String addr)
    {
        this.Name = str;
        this.Salary = amount;
        this.Age = A;
        this.Address = addr;
    }
    protected void finalize()
    {
        System.out.println("Inside finalize method");
    }
    void Display()
    {
        System.out.println("Employee Name : "+this.Name);
        System.out.println("Employee Age : "+this.Age);
        System.out.println("Employee Salary : "+this.Salary);
        System.out.println("Employee Address : "+this.Address);
    }
}