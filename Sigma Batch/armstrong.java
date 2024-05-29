import java.util.Scanner;
import java.util.*; 

public class armstrong {
    public static void main(String args[])
    {
    System.out.println("Enter the number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int r,digit=0;
    int copy=n,sum=0;
    while(copy>0)
    {
        r=copy%10;
        copy/=10;
        digit++;
    }
    copy=n;
     while(copy>0)
    {
        r=copy%10;
        sum+=Math.pow(r,digit);
        copy/=10;
    }
    if(sum ==n)
    System.out.println(n+"number is armstrong");
    else
    System.out.println(n+"number is nott palindrom");
    }



}
