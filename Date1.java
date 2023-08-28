class Date{
    private int year;
    private int month;
    private int day;
    Date(){
        year=month=day=0;
    }
    Date(int year,int month,int day)
    {
        this.year=year;
        this.month=month;
        this.day=day;
    }
    void setYear(int year)
    {
        this.year=year;
    }
    int getYear()
    {
        return year;
    }
    void setMonth(int month)
    {
        this.month=month;
    }
    int getMonth()
    {
        return month;
    }
    void setDay(int day)
    {
        this.day=day;
    }
    int getDay()
    {
        return day;
    }
    void disDate()
    
    {
        System.out.println("YEAR       "+year);
        System.out.println("MONTH      "+month);
        System.out.println("DAY        "+day);
    }
}
public class Date1 {
    public static void main(String []args)
    {
        Date d=new Date(1000,1,1);
        d.disDate();
        d.setYear(9999);
        int year=d.getYear();
        System.out.println(year);
        d.setMonth(12);
        int month=d.getYear();
        System.out.println(month);
        d.setDay(31);
        int day=d.getDay();
        System.out.println(day);
    }
}
