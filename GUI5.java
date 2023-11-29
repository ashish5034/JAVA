import java.awt.*;
import java.awt.event.*;
class GUI5
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
        fobj.addWindowListener(new MyListener());
    }
}

class MyListener extends WindowAdapter
{
    public void  windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
}