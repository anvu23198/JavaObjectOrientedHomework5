public class ParseString
{
   public String str;
   
   public ParseString(String str)
   {
      this.str = str;
   }
   
   public int sumOfAllDigits()
   {
      int sum = 0;
      for(int i = 0; i < this.str.length(); i++)
      {
         char c = this.str.charAt(i);
         String a = String.valueOf(c);
         if(a.matches("[0-9]"))
         {
            int temp = Integer.parseInt(a);
            sum += temp;
         }
      }
      return sum;
   }
}