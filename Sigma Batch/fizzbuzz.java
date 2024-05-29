import java.util.*;
import java.io.*;
import java.util.Arrays;
public class fizzbuzz {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
        {
            if((i+1)%3==0&&(i+1)%5==0)
            arr[i]="fizzbuzz";
            else if((i+1)%3==0)
             arr[i]="fizz";
             else if((i+1)%5==0)
              arr[i]="buzz";
              else
              arr[i]=Integer.toString(i+1);

        }
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i] + " ");
        }

    }
    
}
