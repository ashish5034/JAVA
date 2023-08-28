class Rectangle{
    private float length;
    private float width;
    Rectangle(float length,float width)
    {
        this.length=length;
        this.width=width;
    }
    void setLength(float length)
    {
        this.length=length;
    }
    float getLength(){
        return length;
    }
    void setWidth(float width)
    {
        this.width=width;
    }
    float getWidth()
    {
        return width;
    }
    void Display(){
        System.out.println("Lenght of Rectangle   "+length);
        System.out.println("Width of Rectangle    "+width);      
    }
    }

public class Rectangle1 {
    public static void main(String []args)
    {
        Rectangle r=new Rectangle(12, 12);
        r.Display();
        r.setLength(1);
        float length=r.getLength();
        System.out.println(length);
        r.setWidth(1);
        float width=r.getWidth();
        System.out.println(width);
    }
    
}
