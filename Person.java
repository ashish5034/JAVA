class Data{
    char letter;
    String name;
    String add;
    double phone;
void displayData()
{
    System.out.println(name);
    System.out.println(add);
    System.out.println(phone);
    System.out.println(letter);
}
}
public class Person {
    public static void main(String[] args)
    {
        Data d1=new Data();
        d1.letter='Z';
        d1.name="ABC";
        d1.add="DDD";
        d1.phone=02112;
        d1.displayData();

    }
}
