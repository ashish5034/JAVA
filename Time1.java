class Time{
    int hour;
    int minute;
    int second;
    Time(){
        hour=minute=second=0;
    }
        Time(int hour,int minute,int second)
        {
            this.hour=hour;
            this.minute=minute;
            this.second=second;
        }
        void setHour(int hour)
        {
            this.hour=hour;
        }
        int getHour()
        {
            return hour;
        }
        void setMinute(int minute)
        {
            this.minute=minute;
        }
        int getminute()
        {
            return minute;
        }
        void setsecond(int second)
        {
            this.second=second;
        }
        int getsecond()
        {
            return second;
        }
        void disTime()
        {
            System.out.println("HOUR       "+hour);
            System.out.println("MINUTE     "+minute);
            System.out.println("SECOND     "+second);
            
    }
}
public class Time1 {
    public static void main(String [] args)
    {
Time t=new Time(0,0,0);
        t.disTime();
        t.setHour(23);
        int hour=t.getHour();
        System.out.println(hour);
        t.setMinute(59);
        int minute=t.getminute();
        System.out.println(minute);
        t.setsecond(59);
        int second=t.getsecond();
        System.out.println(second);
    }
}
