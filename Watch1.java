class Watch{
   private int hrHand;
    private int minHand;
    private int secHand;
    Watch(){
        hrHand=minHand=secHand=10;
    }
    Watch(int hr, int min, int sec)
    {
        hrHand=hr;minHand=min;secHand=sec;
    }
    //setter
    void setHrHand(int hr){
        hrHand=hr;

    }
    //getter
    int getHrHand()
    {
        return hrHand;
    }
    void setMinHand(int min){
        minHand=min;
    }
   int getMinHand()
   {
    return minHand;
   }
   void setSecHand(int sec){
    secHand=sec;
}
int getSecHand()
{
return secHand;
}
    void showClock()
    {
        System.out.println("HR            "+hrHand);
        System.out.println("MIN           "+minHand);
        System.out.println("SEC           "+secHand);
    }
}
public class Watch1 {
    public static void main(String [] args)
    {
        Watch rolex=new Watch(5,5,5);
        rolex.showClock();
        rolex.setHrHand(10);
        int hr=rolex.getHrHand();
        System.out.println(hr);
        int min=rolex.getMinHand();
        System.out.println(min);
        int sec=rolex.getSecHand();
        System.out.println(sec);
    }
    
}
