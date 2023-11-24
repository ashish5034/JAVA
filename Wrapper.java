class Wrapper
{
    public static void main(String[] args) {
        int no = 11;
        Integer iobj = no;  //boxing
        System.out.println("int premitive data = "+no);
        System.out.println("Wrapped data int = "+iobj);
        
        int i = iobj;//unboxing 
        System.out.println("int premitive data"+i);
    }
}
      
/*
 datatype       Wrapper class

  boolean       Boolean
  byte          Byte
  char          Character
  short         Short
  int           Integer
  float         Float
  double        Double
  lond          Long
 */