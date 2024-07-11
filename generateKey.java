/*
ip1:3521
ip2:2552
ip3:1352
op:125

*/


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        a=(a/100)%10;
        b=(b/10)%10;
        int max=0;
        while(c!=0){
            if(max<(c%10)) max=c%10;
            c=c/10;
        }
        int r=(a*b)*max;
        System.out.println(r);
    }
}
