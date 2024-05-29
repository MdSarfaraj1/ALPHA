import java.util.*;
public class patter{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
          for(int j=1;j<=2*n;j++)
          {
            if(j>=5-i && j<=9-i)
            System.out.print("*");
            else
            System.out.print(" ");
          }
          System.out.print("\n");
        }

    }
}