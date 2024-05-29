
    import java.util.ArrayList;

public class heapsort {//creating max heap
 
       
        public static void sort(int arr[])
        {
            int n=arr.length;
            for(int i=0;i<n;i++)
            {
                heapify(arr,i,n);
            }
            //push lasrgest element to the end
            for(int i=n-1;i>0;i--)
            {
                int temp=arr[0];
                arr[0]=arr[i];
                arr[i]=temp;
                heapify(arr,0,i );                                                             );
            }
           
        }
    
    
      public static void heapify(int arr[],int i,int size)
        {
            int left=2*i+1;
            int right=2*i+2;
            int minidx=i;
            if(left<size && arr[minidx]<arr[left])
            {
                minidx=left;
            }
            if(right<size&& arr[minidx]<arr[right])                                                                
            {
                minidx=right;
            }
            if(minidx!=i)
            {
                int temp=arr[i];
                arr[i] =arr[minidx];
                arr[minidx]=temp;
                 heapify(arr,minidx,size);
            }
          
        }
         public static void main(String args[])
    {
       int arr[]={5,7,2,9,3,4,6};
       sort(arr);
       for(int x:arr)
       {
        System.out.println(x+" ");
       }

    }
}


