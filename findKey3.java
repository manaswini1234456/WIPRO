import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();

		int a1[]=new int[4];
		int a2[]=new int[4];
		int a3[]=new int[4];
		for(int i=0;i<4;i++)
		{
		    a1[i]=n1%10;
		    a2[i]=n2%10;
		    a3[i]=n3%10;
		    n1/=10;
		    n2/=10;
		    n3/=10;
		}
		int s1=Math.max(a1[3],Math.max(a2[3],a3[3]));
		int s2=Math.min(a1[2],Math.min(a2[2],a3[2]));
		int s3=Math.max(a1[1],Math.max(a2[1],a3[1]));
		int s4=Math.min(a1[0],Math.min(a2[0],a3[0]));
		System.out.println(s1+""+s2+""+s3+""+s4);
	}



/*ip1:3521
ip2:2542
ip3:1352
op:15 */
}
