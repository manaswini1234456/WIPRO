/*
ip1:3521
ip2:2452
ip3:1352
op:2231
*/
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d[]=new int[3];
        d[0]=a;
        d[1]=b;
        d[2]=c;
        int maxt=0,mint=9;
        int maxh=0,minh=9;
        int max1=0,min1=9;
        int maxo=0,mino=9;
        for(int i=0;i<3;i++){
            if(d[i]/1000>maxt) 
                 maxt=d[i]/1000;
            if(d[i]/1000<mint) 
                   mint=d[i]/1000;
            if((d[i]/100)%10>maxh) maxh=(d[i]/100)%10;
            if((d[i]/100)%10<minh) minh=(d[i]/100)%10;
            if((d[i]/10)%10>max1) max1=(d[i]/10)%10;
            if((d[i]/10)%10<min1) min1=(d[i]/10)%10;
            if(d[i]%10>maxo) maxo=d[i]%10;
            if(d[i]%10<mino) mino=d[i]%10;
        }
        System.out.print(maxt-mint);
        System.out.print(maxh-minh);
        System.out.print(max1-min1);
        System.out.print(maxo-mino);
    }
}
