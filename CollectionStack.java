import java.util.*;

class CollectionStack
{
    public static void main(String[] args) 
    {
        Stack <Character> sobj = new Stack<Character>();
        
        sobj.push('A');
        sobj.push('B');
        sobj.push('C');
        sobj.push('D');

        System.out.println(sobj);
        System.out.println(sobj.pop());
        System.out.println(sobj.pop());
        System.out.println(sobj);
        sobj.push('C');
        System.out.println(sobj);
    }
}