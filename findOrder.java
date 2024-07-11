/*
input1:ACZa
input2:CAZa
Output:Increasing:2

*/
import java.util.*;
class Main
{
public static String FindtheOrder(String s1,String s2)
{
   boolean increasing=true,decreasing=true,neither=false;
   for(int i=1;i<s1.length();i++)
    {
      if(s1.charAt(i)>s1.charAt(i-1))
       decreasing=false;
      else if(s1.charAt(i)<s1.charAt(i-1))
       increasing=false;
      if(!(increasing) && !(decreasing))
       neither=true;
     }
  String s=new String();
  if(neither==true)
  return "Invalid";
  else
  {
     int c=0;
     for(int i=0;i<s1.length();i++)
     {
         if(s1.charAt(i)!=s2.charAt(i))
          c=c+1;
      }
    if(increasing==true)
    {
      s="Increasing:"+String.valueOf(c);
      return s;
    }
    else 
    {
      s="Decreasing:"+String.valueOf(c);
      return s;
    }
         
  }
      
}
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  String s1=sc.nextLine();
  String s2=sc.nextLine();
  System.out.println(FindtheOrder(s1,s2));
}
}
