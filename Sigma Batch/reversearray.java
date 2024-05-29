import java.util.*;
public class reversearray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of the array:");
        int n=sc.nextInt();
        System.out.println("rnter the elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=n-1;
        while(i<=j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for( i=0;i<n;i++)
        {
           System.out.print(arr[i]+"  ");
        }

    }
    
}
