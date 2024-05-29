import java.util.*;
class lonely{
    public static void main(String args[])
    {
        int num[]={1,3,5,3};
        Arrays.sort(num);
        find(num);
       
    }
    public static void find(int arr[])
    {
        int prev,next;
        for(int i=0;i<arr.length;i++)
        {
            int k=arr[i];
            if(i==0)
            prev=-1;
            else
              prev=arr[i-1];
             if(i==arr.length-1)
            next=-1;
            else
          next=arr[i+1];
          
          if(prev==k||next==k)
        { i++;
          continue;
           }
            if(prev+1==k||prev-1==k||next+1==k||next-1==k)
            continue;
            else
            System.out.println(k+" ");
        }
    }
}