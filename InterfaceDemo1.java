class InterfaceDemo1
{
    public static void main(String args[])
    {
        System.out.println("PI is:"+Circle.PI);
        PPA pobj = new PPA();
        float ret=0.0f;
        ret=pobj.Area(10.7f);
        System.out.print(ret);
        ret=pobj.Circumference(10.7f);
        System.out.print(ret);
    }
}
interface Circle
{
    float PI = 3.14f;
    float Area(float radius);
    public float Circumference(float radius);
}
class PPA implements Circle
{
    public float Area(float radius)
    {
        return PI*radius*radius;
    }
    public float Circumference(float radius)
    {
        return 2*PI*radius;
    }
}