public class subarrays {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,8,45,6};
        for(int i=0;i<8;i++)
        {
            int start=i;
            for(int j=i;j<8;j++)
            {
                int end=j;
                for(int k=start;k<=end;k++)
                {
                System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
}
