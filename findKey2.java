
/*
ip1:3521
ip2:2542
ip3:1352
op:15
*/



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=0;
        while(c!=0){
            if(d<(c%10)) d=c%10;
            c/=10;
        }
        System.out.println(((a/100)%10)*((b/10)%10)-d);
	}
}

