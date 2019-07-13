public class TestParseString
{
   public static void main(String[] args)
   {
      String s1 = "AB458JK2L#4";
      ParseString ps1 = new ParseString(s1);
      System.out.println("Sum of all digits in \"" + s1 + "\" is: ");
      System.out.println(ps1.sumOfAllDigits());
      System.out.println();

      String s2 = "8927KL3PY";
      ParseString ps2 = new ParseString(s2);
      System.out.println("Sum of all digits in \"" + s2 + "\" is: ");
      System.out.println(ps2.sumOfAllDigits());
   }
}