// import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class GUI7
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
        JFrame fobj = new JFrame(title);
        fobj.setSize(300,600);
        fobj.setVisible(true);
        fobj.addWindowListener(new MyListener());

        JButton bobj = new JButton("Submit");
        fobj.add(bobj);
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