public class BinaryInverter
{
   public static void main(String[] args)
   {
      String s1 = "10010111";
      System.out.println("The invert of " + s1 + " is " + invert(s1));
      System.out.println();

      String s2 = "01011010010111010010";
      System.out.println("The invert of " + s2 + " is " + invert(s2));
      System.out.println();

      String s3 = "101";
      System.out.println("The invert of " + s3 + " is " + invert(s3));
      System.out.println();
   }
   
   public static String invert(String str)
   {
      //To be completed
      str = str.replace("1", "R");
      str = str.replace("0", "1");
      str = str.replace("R", "0");
      
      return str;
   }
}