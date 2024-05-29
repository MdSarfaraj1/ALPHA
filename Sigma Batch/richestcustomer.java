import java.util.*;
import java.util.Scanner;
public class richestcustomer {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of m and n");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int i,j,sum=0,answer=0;

        int[][] amount=new int[m][n];
        System.out.println("Enter the elements:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                amount[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
                 sum=0;
            for(j=0;j<n;j++)
            {
                sum+=amount[i][j];
            }
            if(sum>answer)
            answer=sum;
            
       
        }
        System.out.println("Richest customer's ampount is"+answer);

    }
}