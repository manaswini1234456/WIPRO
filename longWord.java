import java.util.*;
class Main
{
  public static String LongWord(String s)
  {
    int n=s.length();
    String ns=new String("");
    if(s.length()>10)
    {
      ns=ns+String.valueOf(s.charAt(0));
      ns=ns+String.valueOf(n-2);
      ns=ns+String.valueOf(s.charAt(n-1));
      return ns;

    }
    else
    {
      return s;
     }
   }
  public static void main(String[] args)
  {
           Scanner sc=new Scanner(System.in);
     String s1=sc.nextLine();
     System.out.println(LongWord(s1));     
  }
}
/*
input:localization
output:l10n
*/
