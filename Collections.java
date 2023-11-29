import java.util.*;
class Collections
{
    public static void main(String[] args) 
    {
        LinkedList <Integer> lobj = new LinkedList<Integer>();
        lobj.add(10);
        lobj.add(20);
        lobj.add(30);
        lobj.add(40);

        System.out.println(lobj);
        
        lobj.addFirst(5);
        System.out.println(lobj);

        if(lobj.contains(30))
        {
            System.out.println("LL contains 30 in it");
        }
        else
        {
            System.out.println("LL not conntains 30 in it");
        }
        System.out.println("Index of 5 is:"+lobj.indexOf(5));//indexing of LL is start from 0 same like array index
        Iterator iobj = lobj.iterator();
         while (iobj.hasNext()) 
        {
            System.out.println(iobj.next());
        }
        System.out.println("Clear all data from LL which contains Integer data in our progrm:");
        lobj. clear();
    }
}