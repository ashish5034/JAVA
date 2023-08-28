class InvoiceItem
{
    private String id;
    private String desc;
    private int qty;
    private double unitprice;
    public InvoiceItem(String id,String desc,int qty,double unitprice)
    {
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitprice=unitprice;
    }
    void setId(String id)
    {
        this.id=id;
    }
    String getId()
    {
        return id;
    }
    void setDesc(String desc)
    {
        this.desc=desc;
    }
    String getDesc()
    {
        return desc;
    }
    void setQty(int qty){
        this.qty=qty;
    }
    int getQty(){
        return qty;
    }
    void setUnit(double unitprice)
    {
        this.unitprice=unitprice;
    }
    double getUnit()
    {
        return unitprice;
    }
    void displayInvoiceItem()
        {
            System.out.println("ID        "+id);
            System.out.println("DESC      "+desc);
            System.out.println("QTY       "+qty);
            System.out.println("UNITPRICE "+unitprice);
        }

    }

public class InvoiceItem1 {
    public static void main(String [] args)
    {
InvoiceItem i=new InvoiceItem("cpag","lnt",4,12000);
        i.displayInvoiceItem();
        i.setId("mayur");
        String id=i.getId();
        System.out.println(id);
        i.setDesc("TCC");
        String desc=i.getDesc();
        System.out.println(desc);
        i.setQty(5);
        double qty=i.getQty();
        System.out.println(qty);
        i.setUnit(12000);
        double unitprice=i.getUnit();
        System.out.println(unitprice);

    }
    
}
