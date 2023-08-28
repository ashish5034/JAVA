public class HollowPyr {
    public static void main(String [] args)
{
    int i,j;
    for(i=1;i<=5;i++)
    {
        for(j=i;j<5;j++)
        {
            System.out.print(" ");
        }
        for(j=1;j<=(2*i-1);j++)
        {
            if(i==5||j==1||j==(2*i-1))
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}    
}
