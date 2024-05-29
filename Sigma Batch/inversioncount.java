import java.util.*;
public class inversioncount 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int count;
        System.out.println("Enter the length");
        int n=sc.nextInt();
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("your enter data is \n");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
       count=merge(arr,0,n-1);
       System.out.println("hello"+count);
  

    }

public static int merge(int arr[],int left,int right)
{
    int count=0;
    if(right>left)
    {
        int mid=(left+right)/2;
        count+=merge(arr,left,mid);
        count+=merge(arr,mid+1,right);
        count+=mergesort(arr,left,mid,right);

    }
    return count;
}
public static int mergesort(int arr[],int left,int mid,int right)
{
    int i=left,j=mid+1,k=0;
    int count=0;
    int temp[]=new int[right-left+1];
    while((i<=mid) && (j<=right))
    {
        if(arr[i]>arr[j])
        {
            count+=mid-i+1;
            temp[k]=arr[j];
            k++;
            j++;
            
        }
        else
        {
            temp[k]=arr[i];
            i++;
            k++;
        }
    }
    while(i<=mid)
    {
        temp[k]=arr[i];
        i++;
        k++;
    }
    while(j<=right)
    {
        temp[k]=arr[j];
        k++;
        j++;
    }
    for( i=left,k=0;i<=right;i++,k++)
    {
        arr[i]=temp[k];
    }
    return count;
}
}