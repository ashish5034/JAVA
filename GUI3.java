import java.awt.*;
import java.awt.event.*;
class GUI3
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
class MyListener implements WindowListener
{
    public void windowDeactivated(WindowEvent obj) {}
    public void windowActivated(WindowEvent obj) {}
    public void windowDeiconified(WindowEvent obj) {}
    public void windowIconified(WindowEvent obj) {}
    public void windowClosed(WindowEvent obj) {}
    public void  windowClosing(WindowEvent obj) {}
    public void  windowOpened(WindowEvent obj) {}
}