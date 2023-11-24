import java.util.*;
class OOP{
    public static void main(String arg[])
    {
        int no1=0, no2=0, ans=0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number: ");
        no1=sobj.nextInt();

        System.out.println("Enter second number: ");
        no2=sobj.nextInt();

        Arithmetic aobj = new Arithmetic(no1,no2);
        ans = aobj.Addition();
        System.out.println("Addition is :"+ans);

        ans = aobj.Substraction();
        System.out.println("Substraction is :"+ans);
       
        ans = aobj.multiplication();
        System.out.println("Multiplication is : "+ans);

        sobj.close();
        
    }
}
class Arithmetic{
    public int value1;
    public int value2;
    public Arithmetic(int A, int B)
    {
        this.value1=A;
        this.value2=B;
    }
    public int Addition()
    {
        int result = 0;
        result = this.value1+this.value2;
        return result;
    }
    public int Substraction()
    {
        int result = 0;
        result = this.value1-this.value2;
        return result;
    }
    public int multiplication()
    {
        int result =0;
        result = this.value1 * this.value2;
        return result;
    }
}
