import java.util.*;
public class twosum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of the array");
        int n=sc.nextInt();
        System.err.println("enter the numbere");
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.err.println("enter the targe");
        int target=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    System.out.println("Index are"  +i+ " \t "   +j);
                }
            }
        }
    }
    
}
