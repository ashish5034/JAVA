import java.awt.*;

class GUI2
{
    public static void main(String[] args) 
    {
        MyFrame mobj = new MyFrame("PPA49");    
    }
}
class MyFrame
{
    public MyFrame(String title)
    {
        Frame fobj = new Frame(title);
        fobj.setSize(300,600);
        fobj.setVisible(true);
    }
}